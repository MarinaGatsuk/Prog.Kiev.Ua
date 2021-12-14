package homework3;

public class Main {
    public static void main(String[] args) throws GroupOverflowException, StudentNotFoundException {
        Student student1 = new Student("Ivan", "Ivanov", Gender.MALE, 11111111);
        Student student2 = new Student("Olena", "Zhdanova", Gender.FEMALE, 11111112);
        Student student3 = new Student("Petro", "Sydorov", Gender.MALE, 11111113);
        Student student4 = new Student("Maryna", "Sydorova", Gender.FEMALE, 11111114);
        Student student5 = new Student("Kateryna", "Boyko", Gender.FEMALE, 11111115);
        Student student6 = new Student("Dmytro", "Sachok", Gender.MALE, 11111116);
        Student student7 = new Student("Daria", "Tkachenko", Gender.FEMALE, 11111117);
        Student student8 = new Student("Iryna", "Kovalenko", Gender.FEMALE, 11111118);
        Student student9 = new Student("Ihor", "Chayka", Gender.MALE, 11111119);
        Student student10 = new Student("Andrii", "Tischenko", Gender.MALE, 11111120);
        Student student11 = new Student("Vasyl", "Kondratenko", Gender.MALE, 11111121);

        Group group1 = new Group("Group1");

        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        group1.addStudent(student5);
        group1.addStudent(student6);
        group1.addStudent(student7);
        group1.addStudent(student8);
        group1.addStudent(student9);

        group1.searchStudentByLastName(student10.getLastName());

        group1.addStudent(student10);
        group1.searchStudentByLastName(student10.getLastName());
        group1.searchStudentByLastName(student11.getLastName());

        group1.addStudent(student11);

        group1.removeStudentByID(student5.getId());
        group1.addStudent(student11);
        group1.searchStudentByLastName(student11.getLastName());


    }
}
