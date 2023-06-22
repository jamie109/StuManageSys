package com.stuv2;

public class Student {
    private String name;
    private String password;
    private String ID;
    private String phoneNumber;

    public Student() {
    }

    public Student(String name, String password, String ID, String phoneNumber) {
        this.name = name;
        this.password = password;
        this.ID = ID;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
