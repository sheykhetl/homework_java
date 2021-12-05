import java.util.Scanner;

public class fifteen {
    public static void main(String []args) {
        fifteenth();
    }
    public static void fifteenth() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        fifteenthRec(n);
    }
    public static int fifteenthRec(int n) {
        if (n == 0) return 0;
        System.out.print((n % 10) + " ");
        fifteenthRec(n / 10);
        return 0;
    }
}