import java.util.ArrayList;
import java.util.List;
public class Instructor implements ITDepartment, LanguageDepartment{
    private String firstname;
    private String lastname;
    private String title;
    private int id;
    private String departmentName;
    private List<Student> studentList = new ArrayList<>();
    private String labName;
    private boolean isLabAvailable;

    public Instructor(){}
    public Instructor(String firstname, String lastname, String title, int id, String departmentName) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
        this.id = id;
        this.departmentName = departmentName;

    }
    public String departmentName() {
        return departmentName;
    }
    public Instructor instructor() {
        return this;
    }
    public Student student() {
        return null;
    }
    public String labName() {
        return labName;
    }
    public boolean isLabAvailable() {
        return isLabAvailable;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getTitle() {
        return title;
    }
    public int getId() {
        return id;
    }
    public List<Student> getStudentList() {
        return studentList;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    public void setLabName(String labName) {
        this.labName = labName;
    }
    public void setLabAvailable(boolean labAvailable) {
        isLabAvailable = labAvailable;
    }
    @Override
    public String toString() {
        return "Instructor{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", title='" + title + '\'' +
                ", id=" + id +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}