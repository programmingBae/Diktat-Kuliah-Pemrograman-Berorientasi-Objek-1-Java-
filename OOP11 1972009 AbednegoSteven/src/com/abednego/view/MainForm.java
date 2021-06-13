package com.abednego.view;
/**
 * @author AbednegoSteven - 1972009
 */
import com.abednego.dao.DepartmentDaoImpl;
import com.abednego.dao.StudentDaoImpl;
import com.abednego.entity.Department;
import com.abednego.entity.Student;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainForm {
    private JTextField textId;
    private JTextField textFirstName;
    private JTextField textLastName;
    private JTextArea textAddress;
    private JComboBox<Department> comboDepartment;
    private JButton buttonAddDepartment;
    private JButton deleteButton;
    private JButton updateButton;
    private JButton resetButton;
    private JButton saveButton;
    private JTable tableStudent;
    private JSplitPane rootPanel;
    private DepartmentDaoImpl departmentDao;
    private StudentDaoImpl studentDao;
    private List<Department> departmentList;
    private List<Student> studentList;
    private DefaultComboBoxModel<Department> departmentDefaultComboBoxModel;
    private StudentTableModel studentTableModel;
    private Student selectedStudent;

    public MainForm() {
        departmentDao = new DepartmentDaoImpl();
        studentDao = new StudentDaoImpl();
        departmentList = new ArrayList<>();
        studentList = new ArrayList<>();
        try {
            departmentList.addAll(departmentDao.fetchAll());
            studentList.addAll(studentDao.fetchAll());
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        departmentDefaultComboBoxModel = new DefaultComboBoxModel<>(departmentList.toArray(new Department[0]));
        comboDepartment.setModel(departmentDefaultComboBoxModel);
        studentTableModel = new StudentTableModel(studentList);
        tableStudent.setModel(studentTableModel);
        tableStudent.setAutoCreateRowSorter(true);

        buttonAddDepartment.addActionListener(e -> {
            String newDepartment = JOptionPane.showInputDialog(rootPanel,"New Department Name");
            if (newDepartment!=null && !newDepartment.trim().isEmpty()){
                Department department = new Department();
                department.setName(newDepartment);
                try {
                    if(departmentDao.addData(department)==1){
                        departmentList.clear();
                        departmentList.addAll(departmentDao.fetchAll());
                        departmentDefaultComboBoxModel.removeAllElements();
                        departmentDefaultComboBoxModel.addAll(departmentList);

                    }
                } catch (SQLException | ClassNotFoundException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
        saveButton.addActionListener(e -> {
            if(textId.getText().trim().isEmpty() || textFirstName.getText().trim().isEmpty() ||
            textLastName.getText().trim().isEmpty() || textAddress.getText().trim().isEmpty() ||
            comboDepartment.getSelectedItem()==null){
                JOptionPane.showMessageDialog(rootPanel,"Please fill id, first name, last name, address, " +
                        "and department","Error",JOptionPane.ERROR_MESSAGE);
            } else{
                Student student = new Student();
                student.setId(textId.getText());
                student.setFirstName(textFirstName.getText());
                student.setLastName(textLastName.getText().trim().isEmpty() ? null : textLastName.getText());
                student.setAddress(textAddress.getText());
                student.setDepartment((Department) comboDepartment.getSelectedItem());
                try {
                    if (studentDao.addData(student)==1){
                        studentList.clear();
                        studentList.addAll(studentDao.fetchAll());
                        studentTableModel.fireTableDataChanged();
                        clearAndReset();
                    }
                } catch (SQLException | ClassNotFoundException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
        resetButton.addActionListener(e -> {
            clearAndReset();
        });
        updateButton.addActionListener(e -> {
            if(textId.getText().trim().isEmpty() || textFirstName.getText().trim().isEmpty() ||
                    textLastName.getText().trim().isEmpty() || textAddress.getText().trim().isEmpty() ||
                    comboDepartment.getSelectedItem()==null){
                JOptionPane.showMessageDialog(rootPanel,"Please fill id, first name, last name, address, " +
                        "and department","Error",JOptionPane.ERROR_MESSAGE);
            } else {
                selectedStudent.setFirstName(textFirstName.getText());
                selectedStudent.setLastName(textLastName.getText().trim().isEmpty() ? null :
                        textLastName.getText());
                selectedStudent.setAddress(textAddress.getText());
                selectedStudent.setDepartment((Department) comboDepartment.getSelectedItem());
                try {
                    if (studentDao.updateData(selectedStudent)==1){
                        studentList.clear();
                        studentList.addAll(studentDao.fetchAll());
                        studentTableModel.fireTableDataChanged();
                        clearAndReset();
                    }
                } catch (SQLException | ClassNotFoundException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
        deleteButton.addActionListener(e -> {
            studentList.remove(selectedStudent);
            try {
                if (studentDao.deleteData(selectedStudent)==1){
                    studentList.clear();
                    studentList.addAll(studentDao.fetchAll());
                    studentTableModel.fireTableDataChanged();
                    clearAndReset();
                }
            } catch (SQLException | ClassNotFoundException throwables) {
                throwables.printStackTrace();
            }
        });
        tableStudent.getSelectionModel().addListSelectionListener(e -> {
            if(!tableStudent.getSelectionModel().isSelectionEmpty()){
                int selectedIndex = tableStudent.convertRowIndexToModel(tableStudent.getSelectedRow());
                selectedStudent = studentList.get(selectedIndex);
                if(selectedStudent!=null){
                    textId.setText(selectedStudent.getId());
                    textFirstName.setText(selectedStudent.getFirstName());
                    textLastName.setText(selectedStudent.getLastName() != null ?
                            selectedStudent.getLastName() : "");
                    textAddress.setText(selectedStudent.getAddress());
                    comboDepartment.setSelectedItem(selectedStudent.getDepartment());
                    textId.setEnabled(false);
                    saveButton.setEnabled(false);
                    updateButton.setEnabled(true);
                }
            }
        });
    }

    private void clearAndReset(){
        textId.setText("");
        textFirstName.setText("");
        textLastName.setText("");
        textAddress.setText("");
        textId.setEnabled(true);
        saveButton.setEnabled(true);
        updateButton.setEnabled(true);
        tableStudent.clearSelection();
        selectedStudent = null;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new MainForm().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(1000,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static class StudentTableModel extends AbstractTableModel {
            private List<Student> students;
            private final String[] COLUMNS = {"ID","FIRST NAME","LAST NAME","DEPARTMENT"};

        public StudentTableModel(List<Student> students) {
            this.students = students;
        }

        @Override
        public int getRowCount() {
            return students.size();
        }

        @Override
        public int getColumnCount() {
            return COLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex){
              case 0 -> students.get(rowIndex).getId();
              case 1 -> students.get(rowIndex).getFirstName();
              case 2 -> students.get(rowIndex).getLastName();
              case 3 -> students.get(rowIndex).getDepartment().getName();
              default -> "";
            };
        }

        @Override
        public String getColumnName(int column) {
            return COLUMNS[column];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if (getValueAt(0,columnIndex)!=null){
                return getValueAt(0,columnIndex).getClass();
            }
            return Object.class;
        }
    }

}
