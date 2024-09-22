package baitapoop_studentver2.pkg1;

import java.util.Scanner;
import java.util.ArrayList;
public class Processor {

    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int option;
        boolean running = true;
        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Add a new student");
            System.out.println("2. Display all students");
            System.out.println("3. Delete a student by id");
            System.out.println("4. Update a student by id");
            System.out.println("5. Find the student wiUpdate a student by id the highest GPA");
            System.out.println("6. Display all students had schoolarship");
            System.out.println("7. Total Tiution Of Students");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    studentList.addStudent();
                    break;
                case 2:
                    studentList.displayAllInfoStudents();
                    break;
                case 3:
                    System.out.print("Nhap ID sinh vien can xoa: ");
                    String idDelete = sc.nextLine();
                    studentList.deleteStudentById(idDelete);
                    break;
                case 4:
                    System.out.print("Nhap ID sinh vien can cap nhat: ");
                    String idUpdate = sc.nextLine();
                    studentList.findStudentById(idUpdate);
                    break;
                case 5:
                    studentList.findTopStudent();
                    break;
                case 6:
                    ArrayList<Student> scholarshipStudents = studentList.findScholarshipStudents();
                    for (Student student : scholarshipStudents) {
                        student.displayinfo();
                        System.out.println("-------------------");
                    }
                    break;
                case 7:
                    double Sum=studentList.caculationTuitionOfAllStudents();
                    System.out.println("Tong hoc phi cuar tat ca sinh vien la: "+Sum);
                    break;
                case 8:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
                    break;
            }
        }
    }

}
