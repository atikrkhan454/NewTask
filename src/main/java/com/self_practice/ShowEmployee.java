package com.self_practice;

public class ShowEmployee {

    public static void main(String[] args) {

        Employee emp1 = new Employee();

        System.out.println("Employee Name:");
        emp1.setName("Atik Ragib Khan");
        System.out.println(emp1.getName());

        System.out.println();

        System.out.println("Employee id");
        emp1.setId(1932);
        System.out.println(emp1.getId());

    }
}
