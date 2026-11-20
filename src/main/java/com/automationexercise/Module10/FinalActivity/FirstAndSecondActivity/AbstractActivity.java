package com.automationexercise.Module10.FinalActivity.FirstAndSecondActivity;

public class AbstractActivity {
    static void main() {

        Employee Irina = new Employee("Irina", 30, "Software Engineer", "TechCorp", 90000);
        Student John = new Student();
        John.setName("John");
        John.setAge(20);
        John.setSchoolName("RTU");


        Irina.introduce();
        John.introduce();

    }
}
