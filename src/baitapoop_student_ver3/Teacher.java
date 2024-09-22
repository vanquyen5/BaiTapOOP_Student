
package baitapoop_student_ver3;

import java.util.Scanner;

public class Teacher extends Person{
    String department;
    String teachingSubject;

    public Teacher(String department, String teachingSubject) {
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public Teacher() {
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }
    void addTeacher(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID: ");
        String id = scanner.nextLine();
        this.setId(id);
        System.out.println("Enter Full Name: ");
        String fullName = scanner.nextLine();
        this.setId(fullName);
        System.out.println("Enter Department: ");
        String department = scanner.nextLine();
        this.setId(department);
        System.out.println("Enter Teaching Subject: ");
        String teachingSubject = scanner.nextLine();
        this.setId(teachingSubject);
    }
    @Override
    public void displayInfo() {
        System.out.println("ID: "+ this.getId());
        System.out.println("Full Name: "+this.getFullName());
        System.out.println("Department: "+this.getDepartment());
        System.out.println("Teaching Subject: "+this.getTeachingSubject());
    }
    void updateTeacherById(String id) {
        Teacher updateTeacher = new Teacher();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ID can update: ");
        id = scanner.nextLine();
        if (this.getId().equals(id)) {
            updateTeacher.setId(id);
            System.out.print("Nhap Ten moi: ");
            updateTeacher.setFullName(scanner.nextLine());

            System.out.print("Nhap bo phan moi: ");
            updateTeacher.setDepartment(scanner.nextLine());

            System.out.print("Nhap mon day moi: ");
            updateTeacher.setTeachingSubject(scanner.nextLine());
        }
        else{
            System.out.println("Khong co giao vien nao co id "+id);
        }
    }
}
