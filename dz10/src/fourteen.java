import java.util.Scanner;

public class fourteen {
    public static void main(String[] args) {
        fourteenth();
    }

    public static void fourteenth() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        fourteenthRec(n);
    }
    public static int fourteenthRec(int n) {
        if (n >= 10) fourteenthRec(n / 10);
        System.out.print(n % 10 + " ");
        return 0;
    }
}