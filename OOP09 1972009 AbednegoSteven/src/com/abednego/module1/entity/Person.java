package com.abednego.module1.entity;

/**
 * @author AbednegoSteven - 1972009
 */

public class Person {
    protected String firstName;
    protected String lastName;
    protected UserStatistic userStatistic = new UserStatistic();
    public Person(){

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public UserStatistic getUserStatistic(){
        return this.userStatistic;
    }
    public void setUserStatistic (UserStatistic userStatistic){
        this.userStatistic = userStatistic;
    }

    @Override
    public String toString() {
        return getFirstName()+" "+   getLastName() ;
    }
}
