import java.util.Scanner;

public class twelve {
    public static void main(String []args){
        twelfth();
    }
    public static int twelfth() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) return 0;
        else if (n % 2 != 0) System.out.println(n);
        return twelfth();
    }
}