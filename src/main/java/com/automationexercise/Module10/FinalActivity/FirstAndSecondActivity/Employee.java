package com.automationexercise.Module10.FinalActivity.FirstAndSecondActivity;

import java.util.List;

public class Employee extends Person {
    private String jobTitle;
    private String company;
    private int salary;

    // Constructor 1: with name and age
    public Employee(String name, int age, String jobTitle, String company, int salary) {
        setName(name);
        setAge(age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }
    // Constructor 2: without name and age
    public Employee(String jobTitle, String company, int salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }


    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany(){
        return company;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    @Override
    public void introduce() {
        System.out.println("My name is " + getName() + ", I am " + getAge() +
                " years old, I work as a "
                + jobTitle + " at " + company +
                ", and my salary is $" + salary);
    }

    public static String getHighestPaid(List<Employee> employees) {
        if (employees == null || employees.isEmpty()) {
            return "No employees found.";
        }

        Employee highestPaidEmployee = employees.get(0);
        for (Employee employee : employees) {
            if (employee.getSalary() > highestPaidEmployee.getSalary()) {
                highestPaidEmployee = employee;
            }
        }
        return highestPaidEmployee.getName();
    }

}
