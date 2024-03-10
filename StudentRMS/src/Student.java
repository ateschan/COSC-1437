//Addison Teschan
//Mar 7 2024
//Student Class
public class Student {
    String firstName, lastName, course;
    int studentID, yearOfStudy;
    public Student(){
        firstName = "";
        lastName = "";
        course = "";
        studentID = -1;
        yearOfStudy = -1;
    }

    public Student(String firstName, String lastName, String course, int studentID, int year){
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.studentID = studentID;
        this.yearOfStudy = year;
    }

    public Student(Student stu){
        this.firstName = stu.firstName;
        this.lastName = stu.lastName;
        this.course = stu.course;
        this.studentID = stu.studentID;
        this.yearOfStudy = stu.yearOfStudy;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
    @Override
    public String toString(){
        String body = "";
        body += "First name: " + firstName + " \n";
        body += "Last name: " + lastName + " \n";
        body += "Course: " + course + " \n";
        body += "Student ID: " + studentID + " \n";
        body += "Year of study: " + yearOfStudy + " \n";
        return body;
    }
}
