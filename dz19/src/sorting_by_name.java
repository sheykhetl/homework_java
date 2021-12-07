import java.util.Comparator;


public class sorting_by_name implements Comparator<student> {
    @Override
    public int compare(student o1, student o2) {
        return o1.getFio().compareTo(o2.getFio());
    }

}