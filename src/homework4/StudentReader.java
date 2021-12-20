package homework4;

import java.util.Scanner;

public class StudentReader {

    public Student readStudentFromKeyboard(){
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Please enter student's name: ");
        student.setName(sc.nextLine());

        System.out.println("Please enter student's last name: ");
        student.setLastName(sc.nextLine());

        System.out.println("Please enter student's gender (MALE/FEMALE): ");
        student.setGender(Gender.valueOf(sc.nextLine()));

        System.out.println("Please enter student's ID number:");
        student.setId(sc.nextInt());

        return student;
    }

}
