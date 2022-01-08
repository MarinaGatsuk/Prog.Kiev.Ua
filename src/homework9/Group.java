package homework9;

import java.util.*;

public class Group {

    private String groupName;
    private List<Student> students = new ArrayList<>();

    public Group() {
    }

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) throws GroupOverflowException {
            if (this.students.size() >= 10) {
                throw new GroupOverflowException("Student " + student.getName() + " " + student.getLastName() + " can't be added to the group " + this.groupName + ". Group is full!");
            } else {
                student.setGroupName(this.groupName);
                this.students.add(student);
                System.out.println("Student " + student.getName() + " " + student.getLastName() + " is added to group " + this.groupName);
            }

    }

    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
        Student foundStudent = null;
        for (Student stud: this.students) {
            if (stud.getLastName().equals(lastName)) {
                System.out.println("Student with last name " + lastName + " is found in group " + this.groupName + ": " + stud.toString());
                foundStudent = stud;
            }
        }
        if (foundStudent == null) {
            throw new StudentNotFoundException("Student with last name " + lastName + " is not found in group " + this.groupName);
        }

        return foundStudent;
    }

    public boolean removeStudentByID(int id) {
        for (Student stud: this.students) {
            if (stud.getId() == id) {
                this.students.remove(stud);
                System.out.println("Student with student card id " + id + " is removed from group " + this.groupName);
                return true;
            }
        }

        return false;
    }

    public void sortStudentsByLastName(){
        this.getStudents().sort(Comparator.nullsLast(new StudentsLastNameComparator()));

    }

    public boolean isEqualStudentExists(Student student){
        for (Student stud: this.students){
            if (stud.equals(student)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", students=" +students.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        return Objects.equals(groupName,group.groupName) && Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        int result = 31 + Objects.hashCode(groupName);
        result = 31 * result + Objects.hashCode(students);
        return result;
    }
}
