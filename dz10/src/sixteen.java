import java.util.Scanner;

public class sixteen {
    public static void main(String []args){
        sixteenth();
    }
    public static void sixteenth() {
        int a = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = n;
        int k = 1;
        while (n != 0) {
            if (n == max) k++;
            if (n > max) {
                max = n;
                k = 1;
            }
            n = in.nextInt();
        }
        a = k;
        System.out.println(a);
    }
}