import java.util.ArrayList;
import java.util.List;

public class SchoolRunner {


    public static void main(String[] args) {


        Instructor instructor = new Instructor("Suleyman", "Alptekin", "Java", 10001,ITDepartment.DEPARTMENT_NAME );

        ITDepartment itStudent = new Student("Ali", "Can", 101, ITDepartment.DEPARTMENT_NAME,instructor );

        System.out.println(itStudent);



        Student student1 = new Student();
        student1.setFirstname("Filiz");
        student1.setLastName("Onat");
        student1.setDepartmentName(ITDepartment.DEPARTMENT_NAME);
        student1.setInstructor(instructor);

        Student student2 = new Student();

        student2.setFirstname("Emre");
        student2.setLastName("Dursun");
        student2.setDepartmentName(ITDepartment.DEPARTMENT_NAME);
        student2.setInstructor(instructor);

        Student student3 = new Student();

        student3.setFirstname("Ali");
        student3.setLastName("Turkes");
        student3.setDepartmentName(ITDepartment.DEPARTMENT_NAME);
        student3.setInstructor(instructor);

        Student student4 = new Student();

        student4.setFirstname("Orcun");
        student4.setLastName("Kadioglu");
        student4.setDepartmentName(LanguageDepartment.DEPARTMENT_NAME);
        student4.setInstructor(instructor);

        List<Student > studentList = new ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);


        instructor.setStudentList(studentList);

        System.out.println(instructor);
        System.out.println(instructor.getStudentList());


        Instructor instructor1 = new Instructor("Ahmet", "Bayram", "Selenium", 10002,ITDepartment.DEPARTMENT_NAME );


        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(instructor);
        instructorList.add(instructor1);



        Student student5 = new Student();
        student5.setFirstname("Yusuf");
        student5.setLastName("Turk");
        student5.setId(100001);
        student5.setDepartmentName(ITDepartment.DEPARTMENT_NAME);
        student5.setInstructorList(instructorList);


        System.out.println(student5);
    }


}