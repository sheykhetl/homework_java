import java.util.Scanner;

public class thirteen {
    public static void main(String []args){
        thirteenth();
    }
    public static int thirteenth() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) return 0;
        System.out.println(n);
        n = in.nextInt();
        if (n == 0) return 0;
        return thirteenth();
    }
}