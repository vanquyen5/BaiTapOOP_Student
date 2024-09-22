package baitapoop_student_ver3;

import java.util.Scanner;

public class Student extends Person {

    float gpa;
    String major;

    public Student() {
    }

    public Student(float gpa, String major) {
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    void addStudents() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        this.setId(id);
        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine();
        this.setFullName(fullName);
        System.out.print("Enter GPA: ");
        float gpa = Float.parseFloat(scanner.nextLine());
        this.setGpa(gpa);
        System.out.print("Enter Major: ");
        String major = scanner.nextLine();
        this.setMajor(major);
    }

    @Override
    public void displayInfo() {
        System.out.println("Thong tin sinh vien");
        System.out.println("ID: " + this.getId());
        System.out.println("Full Name: " + this.getFullName());
        System.out.println("Major: " + this.getMajor());
        System.out.println("GPA: " + this.getGpa());
    }

    void updateStudentById(String id) {
        Student updateStudent = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ID can update: ");
        id = scanner.nextLine();
        if (this.getId().equals(id)) {
            updateStudent.setId(id);
            System.out.print("Nhap Ten moi: ");
            updateStudent.setFullName(scanner.nextLine());

            System.out.print("Nhap Nganh moi: ");
            updateStudent.setMajor(scanner.nextLine());

            System.out.print("Nhap GPA moi: ");
            updateStudent.setGpa(Float.parseFloat(scanner.nextLine()));
        }
        else{
            System.out.println("Khong co sinh vien nao co id "+id);
        }
    }
}
