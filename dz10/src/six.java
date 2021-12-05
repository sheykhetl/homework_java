import java.util.Scanner;

public class six {
    public static void sixth() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        sixthRec(n, 2);
    }
    public static int sixthRec(int n, int i) {
        if (n < 2) {
            System.out.println("NO");
        } else if (n == 2) {
            System.out.println("YES");
        } else if (n % i == 0) {
            System.out.println("NO");
        } else if (i < Math.sqrt(n)) {
            return sixthRec(n, i + 1);
        } else {
            System.out.println("YES");
        }
        return 0;
    }
    public static void main(String[] args) {
        sixth();
    }
}