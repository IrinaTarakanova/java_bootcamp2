package com.automationexercise.Module10.FinalActivity.FourthActivity;

import com.automationexercise.Module10.FinalActivity.FirstAndSecondActivity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args) {

        Employee Peter = new Employee("QA engineer", "Accenture", 2000);
        Employee Maks = new Employee("Software engineer", "Google", 3000);
        Employee John = new Employee("Project manager", "Microsoft", 4000);
        Employee Alex = new Employee("Business analyst", "Amazon", 5000);
        Employee Mike = new Employee("Data scientist", "Facebook", 6000);

        List<Employee> empList = new ArrayList<Employee>();
        empList.add(Peter);
        empList.add(Maks);
        empList.add(John);
        empList.add(Alex);
        empList.add(Mike);

        Peter.setName("Peter");
        Maks.setName("Maks");
        John.setName("John");
        Alex.setName("Alex");
        Mike.setName("Mike");

        System.out.println("The Employee whose salary is the highest is: "
                + Employee.getHighestPaid(empList));

    }
}

