package Database;

import java.util.ArrayList;

public class DatabaseOfPrimarySchool {
    ArrayList<Student> studentsList = new ArrayList<Student>();

    public void addStudent(Student student) {
        studentsList.add(student);
    }

    public void deleteStudent(int deleteNumber) {
        studentsList.removeIf(student -> student.getNumber() == deleteNumber);
    }

    public void updateStudent(int updateNumber, String updateName) {
        for (var student : studentsList) {
            if (student.getNumber() == updateNumber)
                student.setName(updateName);
        }
    }
    public void viewStudents(){
        System.out.println ("The students details are");
        for(var student: studentsList ){

            System.out.print("The student number is  "+ student.getNumber() +"  "+ "The student name is  "+ student.getName() + "\n" );
            }
    }
}
