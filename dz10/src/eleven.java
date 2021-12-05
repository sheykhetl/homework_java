import java.util.Scanner;

public class eleven {
    public static void main(String []args) {
        eleventh();
    }
    public static void eleventh() {
        Scanner in = new Scanner(System.in);
        int k = 0;
        int count = 0;
        int n = in.nextInt();
        if (n == 0) count++;
        while (count != 2) {
            if (n != 0) count = 0;
            if (n == 1) k++;
            n = in.nextInt();
            if (n == 0) count++;
        }
        System.out.println(k);
    }
}