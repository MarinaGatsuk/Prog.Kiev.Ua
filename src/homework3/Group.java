package homework3;

import java.util.Arrays;

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
        try {
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
        } catch (GroupOverflowException e) {
            System.out.println(e.getMessage());
        }
    }

    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
        try {
            for (int i = 0; i < this.students.length; i++) {
                if (this.students[i] == null) {
                    throw new StudentNotFoundException("Student with last name " + lastName + " is not found in group " + this.groupName);
                } else if (this.students[i].getLastName().equals(lastName)) {
                    System.out.println("Student with last name " + lastName + " is found in group " + this.groupName + ": " + this.students[i].toString());
                    return this.students[i];
                } else if (!this.students[i].getLastName().equals(lastName) && i == this.students.length - 1) {
                    throw new StudentNotFoundException("Student with last name " + lastName + " is not found in group " + this.groupName);
                }
            }
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
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

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
