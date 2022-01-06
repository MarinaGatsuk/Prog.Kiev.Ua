package homework4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Group {

    private String groupName;
    private Student[] students = new Student[10];

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

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void addStudent(Student student) throws GroupOverflowException {
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] != null && i == this.students.length - 1) {
                throw new GroupOverflowException("Student " + student.getName() + " " + student.getLastName() + " can't be added to the group " + this.groupName + ". Group is full!");
            } else if (this.students[i] == null) {
                student.setGroupName(this.groupName);
                this.students[i] = student;
                System.out.println("Student " + student.getName() + " " + student.getLastName() + " is added to group " + this.groupName);
                break;
            }
        }
    }

    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
        Student foundStudent = null;
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] != null && this.students[i].getLastName().equals(lastName)) {
                System.out.println("Student with last name " + lastName + " is found in group " + this.groupName + ": " + this.students[i].toString());
                foundStudent = this.students[i];
            }
        }
        if (foundStudent == null) {
            throw new StudentNotFoundException("Student with last name " + lastName + " is not found in group " + this.groupName);
        }

        return foundStudent;
    }

    public boolean removeStudentByID(int id) {
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] != null && this.students[i].getId() == id) {
                this.students[i] = null;
                System.out.println("Student with student card id " + id + " is removed from group " + this.groupName);
                return true;
            }
        }

        return false;
    }

    public void sortStudentsByLastName(){
        Arrays.sort(this.getStudents(), Comparator.nullsLast(new StudentsLastNameComparator()));
    }

    public boolean isEqualStudentExists(Student student){
        for (int i = 0; i < this.students.length; i++){
            if (student.equals(this.students[i])){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        return Objects.equals(groupName,group.groupName) && Arrays.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        int result = 31 + Objects.hashCode(groupName);
        result = 31 * result + Arrays.hashCode(students);
        return result;
    }
}
