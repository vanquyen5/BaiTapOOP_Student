package baitapoop_studentver2.pkg1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {

    ArrayList<Student> studentList = new ArrayList<>();

    public StudentList() {
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien can them: ");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Nhap thong tin sinh vien " + (i + 1) + " :");
            Student student = new Student();
            student.addStudents();
            studentList.add(student);
        }
    }

    void displayAllInfoStudents() {
        System.out.println("THONG TIN TAT CA SINH VIEN");
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            student.displayinfo();
            System.out.println();
        }
    }

    void deleteStudentById(String id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                studentList.remove(i);
                System.out.println("Sinh vien co ID " + id + " da bi xoa");
            }
        }
    }

    Student findStudentById(String id) {
        Scanner sc = new Scanner(System.in);
        Student updatedStudent = new Student();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                updatedStudent.setId(id);
                System.out.print("Nhap Ten moi: ");
                updatedStudent.setFullName(sc.nextLine());

                System.out.print("Nhap Nganh moi: ");
                updatedStudent.setMajor(sc.nextLine());

                System.out.print("Nhap GPA moi: ");
                updatedStudent.setGpa(Float.parseFloat(sc.nextLine()));

                System.out.print("Nhap Ngay Sinh moi: ");
                String dobStr = sc.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    updatedStudent.setDateOfBirth(sdf.parse(dobStr));
                } catch (Exception e) {
                    System.out.println("Wrong Format!");
                }

                studentList.set(i, updatedStudent);
            }
        }
        return updatedStudent;
    }
    Student findTopStudent() {
        Student topStudent = studentList.get(0);
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getGpa()> topStudent.getGpa()) {
                topStudent = student;
            }
        }
        System.out.println("Sinh vien co GPA cao nhat la:");
        topStudent.displayinfo();
        return topStudent;
    }
    public ArrayList<Student> findScholarshipStudents() {
        ArrayList<Student> scholarshipStudents = new ArrayList<>();
        for (Student student : studentList) {
            if (student.isSchoolarship()) {
                scholarshipStudents.add(student);
            }
        }
        return scholarshipStudents;
    }
    double caculationTuitionOfAllStudents(){
        double Sum=0;
        for(int i=0;i<studentList.size();i++){
            Sum+=studentList.get(i).getTuition();
        }
        return Sum;
    }
}
