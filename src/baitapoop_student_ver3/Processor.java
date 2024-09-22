package baitapoop_student_ver3;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        PersonList personList = new PersonList();
        Scanner scanner = new Scanner(System.in);
        int option;
        boolean running = true;
        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Add a new student");
            System.out.println("2. Add a new teacher");
            System.out.println("3. Delete a student by id");
            System.out.println("4. Update a person by id");
            System.out.println("5. Find person with id");
            System.out.println("6. Display Everyone");
            System.out.println("7. Find Top Student");
            System.out.println("8. Find Teacher By Department");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    personList.addStudent();
                    break;
                case 2:
                    personList.addTeacher();
                    break;
                case 3:
                    System.out.println("Nhap id can xoa: ");
                    String idDelete = scanner.nextLine();
                    personList.deletePersonById(idDelete);
                    break;
                case 4:
                    System.out.println("Nhap id can cap nhat: ");
                    String idUpdate = scanner.nextLine();
                    personList.updatePerson(idUpdate);
                    break;
                case 5:
                    System.out.println("Nhap id can tim: ");
                    String idFind= scanner.nextLine();
                    personList.findPersonById(idFind);
                case 6:
                    personList.displayEveryone();
                    break;
                case 7:
                    Student topStudent = personList.findTopStudent();
                    topStudent.displayInfo();
                    break;
                case 8:
                    personList.findTeacherByDepartment();
                    break;
                case 9:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
                    break;
            }
        }
    }

}
