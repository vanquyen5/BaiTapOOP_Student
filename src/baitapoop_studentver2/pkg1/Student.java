package baitapoop_studentver2.pkg1;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Student extends Person {

    float gpa;
    String major;
    double tuition = 10000000;
    boolean schoolarship;

    public Student(float gpa, String major, boolean schoolarship) {
        super();
        this.gpa = gpa;
        this.major = major;
        this.schoolarship = schoolarship;
    }

    public Student() {
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
        this.schoolarship = gpa >= 9;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getTuition() {
        return schoolarship ? tuition * 0.5 : tuition; // Giảm 50% nếu có học bổng
    }

    public void setTuition(double tuition) {       
            this.tuition = tuition;
    }

    public boolean isSchoolarship() {
        return schoolarship;
    }

    public void setSchoolarship(boolean schoolarship) {
            this.schoolarship = schoolarship;
        
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
        System.out.print("Eter Date Of Birth: ");
        String dateOfBirthString = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateOfBirth = sdf.parse(dateOfBirthString);
            this.setDateOfBirth(dateOfBirth);

        } catch (Exception e) {
            System.out.println("Wrong Format!!");
        }
        System.out.print("Enter Major: ");
        String major = scanner.nextLine();
        this.setMajor(major);
    }

    @Override
    public void displayinfo() {
        System.out.println("Thong tin sinh vien");
        System.out.println("ID: " + this.getId());
        System.out.println("Full Name: " + this.getFullName());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date OF Birth: " + sdf.format(dateOfBirth));
        System.out.println("Major: " + this.getMajor());
        System.out.println("GPA: " + this.getGpa());
        System.out.println("Tuition: "+this.getTuition());
    }

}
