package com.self_practice;

public class Employee {

    private int id;
    private  String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {

        if (id <=0){
            throw new IllegalArgumentException("Invalid id");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
