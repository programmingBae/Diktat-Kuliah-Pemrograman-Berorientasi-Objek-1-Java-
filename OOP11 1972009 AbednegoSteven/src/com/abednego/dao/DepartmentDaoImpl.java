package com.abednego.dao;
/**
 * @author AbednegoSteven - 1972009
 */

import com.abednego.entity.Department;
import com.abednego.util.DaoService;
import com.abednego.util.MySQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDaoImpl implements DaoService<Department> {
    @Override
    public int addData(Department department) throws SQLException,
            ClassNotFoundException {
        int result = 0;
        String query = "INSERT INTO department(name) VALUES(?)";
        try (Connection connection = MySQLConnection.createConnection()) {
            try (PreparedStatement ps = connection.prepareStatement(query)){
                ps.setString(1, department.getName());
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
    public int updateData(Department department) throws SQLException,
            ClassNotFoundException {
        int result = 0;
        String query = "UPDATE department SET name = ? WHERE id = ?";
        try (Connection connection = MySQLConnection.createConnection()) {
            try (PreparedStatement ps = connection.prepareStatement(query)){
                ps.setString(1, department.getName());
                ps.setInt(2,department.getId());
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
    public int deleteData(Department department) throws SQLException,
            ClassNotFoundException {
        int result = 0;
        String query = "DELETE FROM department WHERE id = ?";
        try (Connection connection = MySQLConnection.createConnection()) {
            try (PreparedStatement ps = connection.prepareStatement(query)){
                ps.setInt(2,department.getId());
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
    public List<Department> fetchAll() throws SQLException,
            ClassNotFoundException {
        List<Department> departments = new ArrayList<>();
        String query = "SELECT id, name FROM department";
        try (Connection connection = MySQLConnection.createConnection()) {
            try (PreparedStatement ps = connection.prepareStatement(query)) {
                try (ResultSet resultSet = ps.executeQuery()) {
                    while(resultSet.next()){
                        Department department = new Department();
                        department.setId(resultSet.getInt("Id"));
                        department.setName(resultSet.getString("name"));
                        departments.add(department);
                    }
                }
            }
        }
        return departments;
    }
}
