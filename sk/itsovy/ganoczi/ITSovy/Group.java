package sk.itsovy.ganoczi.ITSovy;

import java.time.Month;
import java.util.Random;

public class Group {

    private String name;
    private Student[] arr;
    private int capacity;
    private int size;

    public Group(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.size = 0;
        this.arr = new Student[capacity];
    }

    public boolean addStudent(Student student) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == student)
                return false;
        }
        if (student == null || size == capacity)
            return false;

        arr[size] = student;
        size++;
        return true;
    }

    public boolean deleteStudent(Student student) {
        if (student == null || size == 0) {
            return false;
        }
        int temp = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == student) {
                temp = 1;
            }
            for (i = 0; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
            return true;
        }

        return false;
    }
    public void sort() {


        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i].getLastName().compareToIgnoreCase(arr[j].getLastName())>0){
                    Student temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                } else if (arr[i].getLastName()==arr[j].getLastName()){
                    if (arr[i].getFirstName().compareToIgnoreCase(arr[j].getFirstName())>0){
                        Student temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
    }

    public Student randomStudent(){

        Random rnd=new Random();
        int number=rnd.nextInt(size);

        return arr[number];
    }

    public void getStudentBySubject(){

    }

    public String getStudent(String firstName, String lastName) {
        return null;
    }

    public Student[] getStudent(int month){

        int temp=0;
        for (int i=0; i<size; i++){
            if (month==arr[i].getBirthMonth()){
                temp++;
            }
        }
        temp=0;
        Student[] student=new Student[temp];
        for (int i=0; i<size; i++){
            if (month==arr[i].getBirthMonth()){
                student[temp]=arr[i];
                temp++;
            }
        }
        return student;
    }

    public void print(){
        System.out.println("List of students [" + name + "} : ");
        for (int i = 0; i < size; i++) {
            System.out.println("  " + arr[i].toString());
        }
    }
}
