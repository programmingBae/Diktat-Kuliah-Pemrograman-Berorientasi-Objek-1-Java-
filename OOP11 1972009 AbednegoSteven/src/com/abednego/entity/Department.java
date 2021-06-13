package com.abednego.entity;
/**
 * @author AbednegoSteven - 1972009
 */
public class Department {
    private int id;
    private String name;

    public Department() {
    }

    public Department(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
