package homework9;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Group group1 = new Group("Group1");
        StudentReader sr = new StudentReader();

//        Scanner sc = new Scanner (System.in);

//        System.out.println("Enter number of students you want to add: ");
//        int n = sc.nextInt();

        try {
            for (int i = 0; i<10; i++){
                group1.addStudent(sr.readStudentFromKeyboard());
            }
        } catch (GroupOverflowException e) {
            System.out.println(e.getMessage());
        }

        try {
            group1.addStudent(sr.readStudentFromKeyboard());
        } catch (GroupOverflowException e) {
            System.out.println(e.getMessage());
        }

        group1.removeStudentByID(11111);

        try {
            group1.addStudent(sr.readStudentFromKeyboard());
        } catch (GroupOverflowException e) {
            System.out.println(e.getMessage());
        }

        group1.sortStudentsByLastName();

        for ( Student student: group1.getStudents()) {
            if (student != null){
                System.out.println(student.getName() + " " + student.getLastName());
            }
            else {
                System.out.println("Null");
            }
        }
        GroupFileStorage gfs = new GroupFileStorage();

        gfs.saveGroupToCSV(group1);
        File groupToLoad = gfs.findFileByGroupName(group1.getGroupName(), new File("D:\\Docs"));
        Group group2 = gfs.loadGroupFromCSV(groupToLoad);

        System.out.println(group2.toString());
    }
}

