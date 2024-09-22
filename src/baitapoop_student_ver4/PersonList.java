
package baitapoop_student_ver4;

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
            student.addPerson();
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
            teacher.addPerson();
            personList.add(teacher);
        }
    }
    public void updatePerson(String id) {
        Person person = findPersonById(id);
        if (person != null) {
            person.UupdatePerson(id);
        }
    }

    public void deletePersonById(String id) {
        Person person = findPersonById(id);
        if (person != null) {
            personList.remove(person);
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
    public void displayEveryone() {
        for (Person person : personList) {
            person.displayInfo();
            System.out.println("-------------------------");
        }
    }

    public Student findTopStudent() {
        Student topStudent = null;
        for (Person person : personList) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (topStudent == null || student.getGpa() > topStudent.getGpa()) {
                    topStudent = student;
                }
            }
            
        }
        return topStudent;
    }
    public ArrayList<Teacher> findTeacherByDepartment(String department) {
        ArrayList<Teacher> teachers = new ArrayList<>();
        for (Person person : personList) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.getDepartment().equals(department)) {
                    teachers.add(teacher);
                }
            }
        }
        return teachers;
    }
}
