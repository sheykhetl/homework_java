import java.util.Scanner;

public class four {
    public static void fourth() {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int s = in.nextInt();
        int ans = 0;
        for (int i = (int) Math.pow(10, k - 1); i < Math.pow(10, k); i++) {
            int sum = 0;
            int num = i;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum == s) {
                ans++;
                System.out.println(i);

            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        fourth();
    }
}