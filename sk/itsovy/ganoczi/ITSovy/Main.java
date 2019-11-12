package sk.itsovy.ganoczi.ITSovy;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student erik=new Student("Erik", "Lorinc", new Date());
        Student filip=new Student("Filip", "Andras", new Date());
        Student marika=new Student("Marika", "Szabova", new Date());
        Student agata=new Student("Agata", "Szabova", new Date());
        Student marko=new Student("Marko","Lorinc", new Date());
        Student marcel=new Student("Marcel", "Lorinc", new Date());
        Student peter=new Student("Peter", "Andras", new Date());
        Student jana=new Student("Jana", "Szabova", new Date());
        Student katka=new Student("Katka", "Szabova", new Date());
        Student dusan=new Student("Dusan","Lorinc", new Date());
        Group group1=new Group("Grupa",10);
        group1.addStudent(erik);
        group1.addStudent(filip);
        group1.addStudent(agata);
        group1.addStudent(marko);
        group1.addStudent(marika);
        group1.addStudent(marcel);
        group1.addStudent(peter);
        group1.addStudent(jana);
        group1.addStudent(katka);
        group1.addStudent(dusan);

        group1.print();
        group1.sort();
        group1.print();


        System.out.println();
        System.out.println(group1.randomStudent());


    }
}
