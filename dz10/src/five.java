import java.util.Scanner;

public class five {
    public static void fifth() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fifthRec(n));
    }
    public static int fifthRec(int n) {
        if (n < 10) return n;
        else return (n % 10) + fifthRec(n / 10);
    }
    public static void main(String[] args) {
        fifth();
    }
}