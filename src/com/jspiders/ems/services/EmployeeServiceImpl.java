package com.jspiders.ems.services;

import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{

    private final Scanner scn1 = new Scanner(System.in);
    @Override
    public void addEmployee() {
        System.out.println("add employee feature");

        System.out.println("Enter employee name");
        String name = scn1.next();
        System.out.println("Enter employee job");
        String job = scn1.next();
        System.out.println("Enter employee mgr");
        Integer mgr = scn1.nextInt();
        System.out.println("Enter employee hireDate");
        String hireDate = scn1.next();
        System.out.println("Enter employee sal");
        Integer sal = scn1.nextInt();
        System.out.println("Enter employee comm");
        Integer comm = scn1.nextInt();
        System.out.println("Enter employee deptNo");
        Integer deptNo = scn1.nextInt();


    }
}
