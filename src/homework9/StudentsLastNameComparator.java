package homework9;

import java.util.Comparator;

public class StudentsLastNameComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        String studentLastName1 = s1.getLastName();
        String studentLastName2 = s2.getLastName();

        if (studentLastName1.compareTo(studentLastName2) > 0){
            return 1;
        }
        else if (studentLastName1.compareTo(studentLastName2) < 0){
            return -1;
        }
        return 0;
    }
}
