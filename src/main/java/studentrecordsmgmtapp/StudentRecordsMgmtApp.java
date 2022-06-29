package studentrecordsmgmtapp;


import studentrecordsmgmtapp.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;

public class StudentRecordsMgmtApp {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(110001, "Dave", LocalDate.of(1951,11, 11)));
        students.add(new Student(110002, "Anna", LocalDate.of(1990,12,7)));
        students.add(new Student(110003, "Erica", LocalDate.of(1974, 1, 31)));
        students.add(new Student(110004, "Carlos", LocalDate.of(2009,8,22)));
        students.add(new Student(110005, "Bob", LocalDate.of(1990,3,5)));


        System.out.println("Printing all students ");
        printListOfStudents(students);
        ArrayList<Student> platinum = getListOfPlatinumAlumniStudents(students);
        System.out.println("Printing platinum students: ");
        printListOfStudents(platinum);
    }

    public static void printListOfStudents(ArrayList<Student> studentArray){
        for(Student s : studentArray){
            System.out.println(s.toString());
        }
    }

    public static ArrayList<Student> getListOfPlatinumAlumniStudents(ArrayList<Student> studentArray){
        ArrayList<Student> platinumAlumni = new ArrayList<Student>();
        for(Student s : studentArray){
            if (s.getDateOfAdmission().isBefore(LocalDate.now().minusYears(30))){
                platinumAlumni.add(s);
            }
        }
        return platinumAlumni;
    }
}
