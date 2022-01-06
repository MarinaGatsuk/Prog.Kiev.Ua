package homework4;

import java.util.Objects;

public class Student extends Human implements CSVConverter{
    private int id;
    private String groupName;

    public Student() {
    }

    public Student(String name, String lastName, Gender gender, int id) {
        super(name, lastName, gender);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

@Override
    public String toCSVString() {
        return this.getName()+";"+this.getLastName()+";"+this.getGender().name()+";"+this.id+";"+this.groupName;
    }

@Override
        public Student fromCSVString(String csvString) {
        String [] studentProperties = csvString.split(";");
        Student student = new Student(studentProperties[0],studentProperties[1], Gender.valueOf(studentProperties[2]), Integer.valueOf(studentProperties[3]));
        student.setGroupName(studentProperties[4]);
        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + super.getName() +
                ", lastName=" + super.getLastName() +
                ", gender=" + super.getGender().name() +
                ", id=" + id +
                ", groupName='" + groupName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        return id == student.id && Objects.equals(groupName, student.groupName);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Objects.hash(id, groupName);
        return result;
    }
}
