package com.jamie109;

public class Student {
    private int id;
    private String name;
    private int age;
    private String homeAddr;

    public Student() {
    }

    public Student(int id, String name, int age, String homeAddr) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.homeAddr = homeAddr;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return homeAddr
     */
    public String getHomeAddr() {
        return homeAddr;
    }

    /**
     * 设置
     * @param homeAddr
     */
    public void setHomeAddr(String homeAddr) {
        this.homeAddr = homeAddr;
    }

    public String toString() {
        return "Student{id = " + id + ", name = " + name + ", age = " + age + ", homeAddr = " + homeAddr + "}";
    }
}
