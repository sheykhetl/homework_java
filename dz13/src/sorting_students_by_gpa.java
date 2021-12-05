import java.util.Comparator;

public class sorting_students_by_gpa implements Comparator <student> {
    @Override
    public int compare(student o1, student o2) {
        return  o1.getGpa()<o2.getGpa()? 1: -1;
    }
}