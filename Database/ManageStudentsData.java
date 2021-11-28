package Database;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageStudentsData {
    public static void main(String[] args) {
        ArrayList viewList = new ArrayList();
        DatabaseOfPrimarySchool databaseOfPrimarySchool = new DatabaseOfPrimarySchool();

        Scanner scan = new Scanner(System.in);
        System.out.println("Are you an admin?" + "\n" + "please enter Yes or No");
        String adminOrNot = scan.next();
        if (adminOrNot.toLowerCase().equals("yes")) {

            while (true) {
                System.out.println("Press 1 to add  student details" + "\n" + "2 for delete" + "\n" + "3 to update" + "\n" + "4 to view " + "\n" + "5 to exit");
                int choice = scan.nextInt();

                switch (choice) {
                    case (1):
                        System.out.println("Enter student number to add");
                        int addNumber = scan.nextInt();
                        System.out.println("Enter student name to add");
                        String addName = scan.next();
                        Student addStudent = new Student(addNumber, addName);
                        databaseOfPrimarySchool.addStudent(addStudent);
                        System.out.println("Added succesfully!!!");
                        continue;
                    case (2):
                        System.out.println("Enter student number to delete");
                        int deleteNumber = scan.nextInt();
                        databaseOfPrimarySchool.deleteStudent(deleteNumber);
                        System.out.println("Deleted succesfully!!!");
                        continue;
                    case (3):
                        System.out.println("Enter student number to update");
                        int updateNumber = scan.nextInt();
                        System.out.println("Enter name for updating");
                        String updateName = scan.next();
                        databaseOfPrimarySchool.updateStudent(updateNumber, updateName);
                        System.out.println("Updated succesfully !!!");
                        continue;
                    case (4):
                        databaseOfPrimarySchool.viewStudents();
                        continue;
                    case (5):
                        return;
                    default:
                        System.out.println("Enter the correct choice" + "Press 1 to add a student details" + "\n" + "2 for delete" + "\n" + "3 to update" + "\n" + "4 to view " + "\n" + "5 to exit");
                }
            }
        } else
            databaseOfPrimarySchool.viewStudents();
    }
}


