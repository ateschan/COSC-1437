public class University {
    private String universityName, location;
    private Professor professor;

    public University(){
        universityName = "";
        location = "";
        professor = new Professor();
    }

    public University(String universityName, String location, Professor professor){
        this.universityName = universityName;
        this.location = location;
        this.professor = new Professor(professor);
    }
    public University(University uni){
        this.universityName = uni.universityName;
        this.location = uni.location;
        this.professor = new Professor(uni.professor);
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
