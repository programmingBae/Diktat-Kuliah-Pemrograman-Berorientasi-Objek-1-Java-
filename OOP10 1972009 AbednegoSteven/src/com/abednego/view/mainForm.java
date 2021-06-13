package com.abednego.view;
/**
 * @author AbednegoSteven - 1972009
 */

import com.abednego.entity.Category;
import com.abednego.entity.Item;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class mainForm {

    private JMenu File;
    private JMenu Help;
    private JMenuItem Add;
    private JMenuItem Exit;
    private JMenuItem About;
    private JTextField textId;
    private JTextField textName;
    private JTextField textPrice;
    private JButton updateButton;
    private JButton resetButton;
    private JButton saveButton;
    private JComboBox<Category> comboBox2;
    private JSplitPane splitPanel;
    private JTable table1;
    private JPanel rootPanel;
    private JPanel itemForm;
    private Item selectedItem;
    private int selectedIndex;
    private Category categories ;


    public mainForm() {
        categories = new Category();
        // shortcut keys for add category
        KeyStroke ctrlF1 = KeyStroke.getKeyStroke(KeyEvent.VK_F1, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask());
        Add.setAccelerator(ctrlF1);
        // shortcut keys for exit
        Exit.setAccelerator(KeyStroke.getKeyStroke("control shift  Q"));
        // shortcut key for about
        About.setAccelerator(KeyStroke.getKeyStroke("F1"));
        // list that contains list of categories
        List<Category> categoryList = new ArrayList<>();
        // list that contains list of itemss
        List<Item> itemss = new ArrayList<>(categories.getItems());
        ItemTableModel itemTableModel = new ItemTableModel(itemss);
        table1.setModel(itemTableModel);
        table1.setAutoCreateRowSorter(true);
        // addCategory JMenuItem listener
        Add.addActionListener(e -> {
            String category = JOptionPane.showInputDialog("New Category Name");
            categoryList.add(new Category(categoryList.size()+1,category));
            DefaultComboBoxModel<Category> categoryComboModel =
                    new DefaultComboBoxModel<>(categoryList.toArray(new Category[0]));
            comboBox2.setModel(categoryComboModel);
        });
        // exit JMenuItem listener
        Exit.addActionListener(e -> {
            System.exit(0);
        });
        resetButton.addActionListener(e -> {
            clearAndReset();
        });
        saveButton.addActionListener(e -> {
            if (textName.getText().isEmpty() || textId.getText().isEmpty()||textPrice.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPanel, "Please fill in all field",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }else {
                try {
                    int id = Integer.parseInt(textId.getText());
                    String name = (textName.getText());
                    String y = textPrice.getText();
                    String x = y.replace(",", "");
                    int price = (Integer.parseInt(x));
                    itemss.add(new Item(id, name, price, (Category) comboBox2.getSelectedItem()));
                    itemTableModel.fireTableDataChanged();
                    clearAndReset();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(rootPanel, "Please only input number for ID and Price",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        updateButton.addActionListener(e -> {
            selectedItem.setName(textName.getText());
            selectedItem.setId(Integer.parseInt(textId.getText()));
            String y = textPrice.getText();
            String x = y.replace(",","");
            selectedItem.setPrice(Integer.parseInt(x));
            selectedItem.setCategory((Category) comboBox2.getSelectedItem());
            itemss.set(selectedIndex,selectedItem);
            itemTableModel.fireTableDataChanged();
        });
        table1.getSelectionModel().addListSelectionListener(e -> {
            if (!table1.getSelectionModel().isSelectionEmpty()){
                selectedIndex = table1.convertRowIndexToModel(table1.getSelectedRow());
                selectedItem = itemss.get(selectedIndex);
                if(selectedItem!=null){
                    textId.setText(String.valueOf(selectedItem.getId()));
                    textName.setText(selectedItem.getName());
                    textPrice.setText(String.valueOf(selectedItem.getPrice()));
                    comboBox2.setSelectedItem(selectedItem.getCategory());
                    saveButton.setEnabled(false);
                    updateButton.setEnabled(true);

                }
            }
        });
        // about JMenuItem listener
        About.addActionListener(e -> {
            JOptionPane.showMessageDialog(rootPanel,"Aplikasi ini dibuat oleh Abednego Steven - 1972009",
                    "About",JOptionPane.INFORMATION_MESSAGE);
        });
    }
    // method for clear and reset form
    private void clearAndReset(){
        textId.setText("");
        textName.setText("");
        textPrice.setText("");
        table1.clearSelection();
        saveButton.setEnabled(true);
        updateButton.setEnabled(false);
        selectedItem = null;
        selectedIndex = -1;

    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("PBO2 M10");
        frame.setContentPane(new mainForm().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static class ItemTableModel extends AbstractTableModel{
        private final String[] COLUMNS = {"ID", "NAME", "PRICE", "CATEGORY"};
        private List<Item> items;

        public ItemTableModel(List<Item> items) {
            this.items = items;
        }

        @Override
        public int getRowCount() {
            return items.size();
        }

        @Override
        public int getColumnCount() {
            return COLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch(columnIndex){
                case 0 -> items.get(rowIndex).getId();
                case 1 -> items.get(rowIndex).getName();
                case 2 -> items.get(rowIndex).getPrice();
                case 3 -> items.get(rowIndex).getCategory();
                default -> "-";
            };
        }

        @Override
        public String getColumnName(int column) {
            return COLUMNS[column];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if (getValueAt(0,columnIndex) != null){
                return getValueAt(0,columnIndex).getClass();
            }else{
                return Object.class;
            }
        }
    }
}
