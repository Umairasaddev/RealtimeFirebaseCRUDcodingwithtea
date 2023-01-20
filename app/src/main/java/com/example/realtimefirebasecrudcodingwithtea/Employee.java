package com.example.realtimefirebasecrudcodingwithtea;
//getter and setter class

public class Employee {

    private String name;
    private String pos;

    public Employee(String name, String pos) {
        this.name = name;
        this.pos = pos;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }
}
