package sk.itsovy.ganoczi.ITSovy;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student erik=new Student("Erik", "Lorinc", new int[]{12,10,1992,});
        Student filip=new Student("Filip", "Andras", new int[]{5,4,1998});
        Student marika=new Student("Marika", "Szabova", new int[]{3,6,2000});
        Student agata=new Student("Agata", "Szabova", new int[]{1,11,2001});
        Student marko=new Student("Marko","Lorinc", new int[]{16,8,1999});
        Student marcel=new Student("Marcel", "Lorinc", new int[]{21,7,1993});
        Student peter=new Student("Peter", "Andras", new int[]{20,7,1994});
        Student jana=new Student("Jana", "Szabova", new int[]{18,6,1998});
        Student katka=new Student("Katka", "Szabova", new int[]{13,4,1997});
        Student dusan=new Student("Dusan","Lorinc", new int[]{25,12,1999});
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

        dusan.getZodiac(dusan);
        System.out.println("Narodeny v mesiac :");
        group1.deleteStudent(dusan);
        group1.deleteStudent(erik);
        group1.print();
        /*System.out.println(group1.getStudent(10));*/

        System.out.println("------------ ");
        katka.addSubject("MAT");
        katka.addSubject("GEO");
        katka.addSubject("FYZ");
        katka.addSubject("PRO");
        katka.addSubject("EKO");
        katka.printSubjects();

    }
}
