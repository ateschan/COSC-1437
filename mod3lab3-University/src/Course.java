public class Course {
    private String courseName, courseCode;

    public Course(){
        courseName = "";
        courseCode = "";
    }

    public Course(String courseName, String courseCode){
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public Course(Course course){
        this.courseName = course.courseName;
        this.courseCode = course.courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
