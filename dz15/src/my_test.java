import java.util.ArrayList;
import java.util.List;

public class my_test {
    public static void main(String[] args) {
        my_list<Integer> list = new my_list<Integer>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}