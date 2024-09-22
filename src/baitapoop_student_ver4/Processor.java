package baitapoop_student_ver4;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        PersonList personList = new PersonList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add new student");
            System.out.println("2. Add new teacher");
            System.out.println("3. Update person by ID");
            System.out.println("4. Delete person by ID");
            System.out.println("5. Display all students and teachers");
            System.out.println("6. Find the student with the highest GPA");
            System.out.println("7. Find teachers by department");
            System.out.println("8. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    personList.addStudent();
                    break;

                case 2:
                    
                    personList.addTeacher();
                    break;

                case 3:
                    System.out.print("Enter person ID to update: ");
                    String updateId = scanner.nextLine();
                    personList.updatePerson(updateId);
                    break;

                case 4:
                    System.out.print("Enter person ID to delete: ");
                    String deleteId = scanner.nextLine();
                    personList.deletePersonById(deleteId);
                    break;

                case 5:
                    personList.displayEveryone();
                    break;

                case 6:
                    Student topStudent = personList.findTopStudent();
                    if (topStudent != null) {
                        System.out.println("Top Student:");
                        topStudent.displayInfo();
                    } else {
                        System.out.println("No students available.");
                    }
                    break;

                case 7:
                    System.out.print("Enter department: ");
                    String findDepartment = scanner.nextLine();
                    ArrayList<Teacher> teachers = personList.findTeacherByDepartment(findDepartment);
                    for (Teacher teacher : teachers) {
                        teacher.displayInfo();
                    }
                    break;

                case 8:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
