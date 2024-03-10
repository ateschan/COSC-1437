//Addison Teschan
//Feb 18 2024
// University
// Uni > Prof > Course takes input and displays it

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String courseName, courseCode, professorName, department, universityName, location;

       System.out.println("Course Name? ");
       courseName = scan.nextLine();
       System.out.println("Course Code? ");
       courseCode = scan.nextLine();
       System.out.println("Professor Name? ");
       professorName = scan.nextLine();
       System.out.println("Department? ");
       department = scan.nextLine();
       System.out.println("University Name? ");
       universityName = scan.nextLine();
       System.out.println("Location? ");
       location = scan.nextLine();

       Course course = new Course(courseName, courseCode);
       Professor prof = new Professor(professorName, department, course);
       University uni = new University(universityName, location, prof);

       System.out.println(
               "Course Name: " + uni.getProfessor().getCourse().getCourseName() +
               "\nCourse Code: " + uni.getProfessor().getCourse().getCourseCode() +
               "\nProfessor Name: " + uni.getProfessor().getProfessorName() +
               "\nDepartment: " + uni.getProfessor().getDepartment() +
               "\nUniversity Name: " + uni.getUniversityName() +
               "\nLocation: " + uni.getLocation());
    }
}