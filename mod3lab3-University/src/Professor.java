public class Professor {
    private String professorName, department;
    private Course course;

    public Professor(){
        professorName = "";
        department = "";
        course = new Course();
    }

    public Professor(String name,String dep, Course course){
        this.professorName = name;
        this.department = dep;
        this.course = new Course(course);
    }


    public Professor(Professor prof){
        this.professorName =  prof.professorName;
        this.department = prof.department;
        this.course = new Course(prof.course);
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
