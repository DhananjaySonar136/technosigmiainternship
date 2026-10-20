package Day3;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {
    public int compare(Student s1,Student s2){
        return s2.id - s1.id;
    }
}
