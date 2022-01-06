package homework4;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Student student1 = new Student("Ivan", "Ivanov", Gender.MALE, 11111111);
       Student student2 = new Student("Ivan", "Ivanov", Gender.MALE, 11111111);
       Student student3 = new Student("Ivan", "Ivanov", Gender.MALE, 11111111);
       Student student4 = new Student("Olena", "Zhdanova", Gender.FEMALE, 11111114);
       Student student5 = new Student("Taras", "Sazonov", Gender.MALE, 11111115);


        System.out.println("student1.equals(student1) " + student1.equals(student1));
        System.out.println("student1.equals(student2) " + student1.equals(student2) + " => student2.equals(student1) " + student2.equals(student1));
        System.out.println("student1.equals(student2) " + student1.equals(student2) + " and student2.equals(student3) " +
                student2.equals(student3) + " => student1.equals(student3)" + student1.equals(student3));

        System.out.println("student1.equals(null) " + student1.equals(null));
        System.out.println("student1.equals(student2) " + student1.equals(student2) + " student1.hashCode == student2.hashCode " + (student1.hashCode() == student2.hashCode()));

        Group group1 = new Group("Group1");
       try {
           group1.addStudent(student1);
           group1.addStudent(student2);
           group1.addStudent(student3);
           group1.addStudent(student4);
       } catch (GroupOverflowException e){
           System.out.println(e.getMessage());
       }
       group1.isEqualStudentExists(student1);
        System.out.println("Is student " + student4.toString() + " already present in group: " + group1.isEqualStudentExists(student4));
        System.out.println("Is student " + student5.toString() + " already present in group: " + group1.isEqualStudentExists(student5));


    }




}
