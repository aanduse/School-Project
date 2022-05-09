import java.util.ArrayList;
import java.util.List;
public class Student  implements ITDepartment, LanguageDepartment{
    private String firstname;
    private String lastName;
    private int id;
    private String departmentName;
    private Instructor instructor;
    private List<Instructor> instructorList = new ArrayList<>();
    private String labName;
    private boolean isLabAvailable;
    public Student(){
    }
    public Student(String firstname, String lastName, int id, String departmentName, Instructor instructor) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.id = id;
        this.departmentName = departmentName;
        this.instructor = instructor;
    }
    @Override
    public String departmentName() {
        return departmentName;
    }
    @Override
    public Instructor instructor() {
        return instructor;
    }
    @Override
    public Student student() {
        return this;
    }
    @Override
    public String labName() {
        return labName;
    }
    @Override
    public boolean isLabAvailable() {
        return isLabAvailable;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    public void setInstructorList(List<Instructor> instructorList) {
        this.instructorList = instructorList;
    }
    public void setLabName(String labName) {
        this.labName = labName;
    }
    public void setLabAvailable(boolean labAvailable) {
        isLabAvailable = labAvailable;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastName() {
        return lastName;
    }
    public int getId() {
        return id;
    }
    public List<Instructor> getInstructorList() {
        return instructorList;
    }
    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", instructor=" + instructorList +
                '}';
    }
}
