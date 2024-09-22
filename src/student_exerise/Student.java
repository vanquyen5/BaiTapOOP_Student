package student_exerise;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    private float GPA;
    private String Major;

    public Student() {
        super();
    }

    // Hàm tạo đầy đủ
    public Student(String id, String fullName, Date dateOfBirth, float GPA, String Major) {
        super(id, fullName, dateOfBirth); // Gọi constructor của lớp Person
        this.GPA = GPA;
        this.Major = Major;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        String id = scanner.nextLine();
        setId(id);
        System.out.print("Nhap Full Name: ");
        String fullName = scanner.nextLine();
        setFullName(fullName);
        System.out.print("Nhap GPA: ");
        float GPA = Float.parseFloat(scanner.nextLine());
        setGPA(GPA);
        System.out.print("Nhap Date Of Birth: ");
        String dateOfBirthString = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateOfBirth = sdf.parse(dateOfBirthString);
            setDateOfBirth(dateOfBirth);
        } catch (Exception e) {
            System.out.print("Wrong Format!!");
        }
        System.out.print("Nhap Major: ");
        String major = scanner.nextLine();
        setMajor(major);
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\nThong Tin Cua Sinh Vien: ");
        System.out.println("ID: " + this.getId());
        System.out.println("Ten: " + this.getFullName());
        System.out.println("GPA: " + this.getGPA());
        System.out.println("Nganh: " + this.getMajor());
        System.out.println("Ngay Sinh: " + sdf.format(this.getDateOfBirth()));
    }
}
