package sk.itsovy.ganoczi.ITSovy;

import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private Date birthDay;

    public Student(String firstName, String lastName, Date birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDay() {
        return birthDay;
    }


    @Override
    public String toString(){
        return firstName+" "+lastName;
    }
}
