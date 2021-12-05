import java.util.Scanner;

public class three {
    public static void third() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a < b) for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
        else if (a >= b) for (int i = a; i >= b; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        third();
    }
}