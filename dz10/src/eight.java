import java.util.Scanner;

public class eight {
    public static void eighth() {
        Scanner in = new Scanner(System.in);
        String myString = in.nextLine();
        StringBuffer buffer = new StringBuffer(myString);
        buffer.reverse();
        String data = buffer.toString();
        if (myString.equals(data)) System.out.println("YES");
        else System.out.println("NO");
    }
    public static void main(String[] args) {
        eighth();
    }
}