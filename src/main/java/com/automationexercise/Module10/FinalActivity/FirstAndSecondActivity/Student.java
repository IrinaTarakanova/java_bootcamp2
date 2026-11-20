package com.automationexercise.Module10.FinalActivity.FirstAndSecondActivity;

public class Student extends Person {
private String schoolName;

public String getSchoolName(){
    return schoolName;
}
public void setSchoolName(String schoolName) {
    this.schoolName = schoolName;
}

@Override
public void introduce() {
    System.out.println("I am student in " + getSchoolName() + " university.");
}

}
