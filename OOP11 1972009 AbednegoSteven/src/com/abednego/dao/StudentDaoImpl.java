package com.abednego.dao;
/**
 * @author AbednegoSteven - 1972009
 */
import com.abednego.entity.Department;
import com.abednego.entity.Student;
import com.abednego.util.DaoService;
import com.abednego.util.MySQLConnection;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements DaoService<Student> {
    @Override
    public int addData(Student student) throws SQLException, ClassNotFoundException {
        int result = 0;
        String query = "INSERT INTO student(id,first_name,last_name,address,department_id) "+"VALUES(?,?,?,?,?)";
        try (Connection connection = MySQLConnection.createConnection()) {
            try (PreparedStatement ps = connection.prepareStatement(query)){
                ps.setString(1, student.getId());
                ps.setString(2,student.getFirstName());
                ps.setString(3,student.getLastName());
                ps.setString(4,student.getAddress());
                ps.setInt(5,student.getDepartment().getId());
                if(ps.executeUpdate()!= 0){
                    connection.commit();
                    result = 1;
                } else {
                    connection.rollback();
                }
            }
        }
        return result;
    }

    @Override
    public int updateData(Student student) throws SQLException, ClassNotFoundException {
        int result = 0;
        String query = "UPDATE student SET first_name = ?, last_name = ?, address = ?, "
                +"department_id = ? WHERE id = ?";
        try (Connection connection = MySQLConnection.createConnection()) {
            try (PreparedStatement ps = connection.prepareStatement(query)){
                ps.setString(1,student.getFirstName());
                ps.setString(2,student.getLastName());
                ps.setString(3,student.getAddress());
                ps.setInt(4,student.getDepartment().getId());
                ps.setString(5,student.getId());
                if(ps.executeUpdate()!= 0){
                    connection.commit();
                    result = 1;
                } else {
                    connection.rollback();
                }
            }
        }
        return result;
    }

    @Override
    public int deleteData(Student student) throws SQLException, ClassNotFoundException {
        int result = 0;
        String query = "DELETE FROM student WHERE id = ?";
        try (Connection connection = MySQLConnection.createConnection()) {
            try (PreparedStatement ps = connection.prepareStatement(query)){
                ps.setString(1,student.getId());
                if(ps.executeUpdate()!= 0){
                    connection.commit();
                    result = 1;
                } else {
                    connection.rollback();
                }
            }
        }
        return result;
    }

    @Override
    public List<Student> fetchAll() throws SQLException, ClassNotFoundException {
        List<Student> students = new ArrayList<>();
        String query = "SELECT s.id, first_name, last_name, address, department_id, name FROM "+
                "student s JOIN department d ON s.department_id = d.id";
        try (Connection connection = MySQLConnection.createConnection()) {
            try (PreparedStatement ps = connection.prepareStatement(query)) {
                try (ResultSet resultSet = ps.executeQuery()) {
                    while(resultSet.next()){
                        Department department = new Department();
                        department.setId(resultSet.getInt("department_id"));
                        department.setName(resultSet.getString("name"));
                        Student student = new Student();
                        student.setId(resultSet.getString("id"));
                        student.setFirstName(resultSet.getString("first_name"));
                        student.setLastName(resultSet.getString("last_name"));
                        student.setAddress(resultSet.getString("address"));
                        student.setDepartment(department);
                        students.add(student);
                    }
                }
            }
        }


        return students;
    }
}
