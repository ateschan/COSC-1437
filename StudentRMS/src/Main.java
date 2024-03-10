//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Addison Teschan
//Mar 7 2024
//Displaying students using hardcoded data

import java.util.ArrayList;
public class Main {
    public static void displayAllStudents(ArrayList<Student> arr){
        for (Student stu : arr){
            System.out.println(stu);
        }
    }
    public static void main(String[] args) {
        ArrayList<Student> studentRecords = new ArrayList<Student>();
        studentRecords.add(new Student("Danial","Bananiel","DanialCourse",2993287,23));
        studentRecords.add(new Student("ial","Baniel","ialCourse",2998987,23));
        studentRecords.add(new Student("Dial","Banael","DialCourse",2931287,24));
        displayAllStudents(studentRecords);
    }
}