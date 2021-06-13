package com.abednego.entity;
/**
 * @author AbednegoSteven - 1972009
 */
import java.util.HashSet;
import java.util.Set;

public class Category {
    private int id;
    private String name;
    private Set<Item>  items = new HashSet<>();

    public Category() {

    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;;
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

    public Set getItems() {
        return items;
    }

    public void setItems(Set items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return name ;
    }
}
