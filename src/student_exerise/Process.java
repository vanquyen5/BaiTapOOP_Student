package student_exerise;


import java.util.Scanner;

public class Process {

    public static void main(String[] args) {
        StudentList studentList = new StudentList();
       
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Add a new student");
            System.out.println("2. Update a student by id");
            System.out.println("3. Delete a student by id");
            System.out.println("4. Display all students");
            System.out.println("5. Find the student with the highest GPA");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    // Thêm sinh viên mới
                    studentList.addStudent();
                    break;
                case 2:
                    studentList.updateStudentById();
                    break;

                case 3:
                    // Xóa sinh viên theo ID
                    studentList.deleteStudentById();
                    break;

                case 4:
                    // Hiển thị tất cả sinh viên
                    studentList.displayAllStudent();
                    break;

                case 5:
                    
                    studentList.findTopStudent();
                    break;

                case 6:
                    // Thoát chương trình
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
