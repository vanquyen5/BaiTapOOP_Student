package baitapoop_student_ver3;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonList {

    ArrayList<Person> personList = new ArrayList<>();

    public PersonList() {
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien can them: ");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            Student student = new Student();
            student.addStudents();
            personList.add(student);
        }
    }

    void addTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong giao vien can them: ");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Nhap thong tin giao vien thu " + (i + 1) + ":");
            Teacher teacher = new Teacher();
            teacher.addTeacher();
            personList.add(teacher);
        }
    }

    void updatePerson(String id) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        Teacher teacher = new Teacher();
        boolean running = true;
        System.out.println("Cap nhat??");
        System.out.println("1. Sinh vien");
        System.out.println("2. Giao vien");
        System.out.println("3. Exit");
        System.out.println("Please choose option: ");
        int option = scanner.nextInt();
        while (running) {
            switch (option) {
                case 1:
                    student.updateStudentById(id);
                    break;
                case 2:
                    teacher.updateTeacherById(id);
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }

    void deletePersonById(String id) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId().equals(id)) {
                personList.remove(i);
            }
        }
    }
    public Person findPersonById(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }
    void displayEveryone(){
        for(int i=0;i<personList.size();i++){
            Person person=personList.get(i);
            person.displayInfo();
            System.out.println();
        }
    }
    Student findTopStudent(){
        Student topStudent = null;
        for(int i=0;i<personList.size();i++){
            if(personList.get(i)instanceof Student){
                Student student = (Student) personList.get(i);
                if(student.getGpa()>topStudent.getGpa()){
                    topStudent=student;
                }
            }
        }
        return topStudent;
    }
    Teacher findTeacherByDepartment(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap department cua Teacher can tim: ");
        String department=scanner.nextLine();
        for(int i=0;i<personList.size();i++){
            if(personList.get(i)instanceof Teacher){
                Teacher teacher = (Teacher) personList.get(i);
                if(teacher.getDepartment().equals(department)){
                    teacher.displayInfo();
                    return teacher;
                }
            }
        }
        return null;
    }
}
