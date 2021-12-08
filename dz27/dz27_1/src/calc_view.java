import java.util.Scanner;

public class calc_view {

    public String getExpression() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void printResult(int result) {
        System.out.println("result is " + result);
    }

    public void printException(Exception exception) {
        System.err.println("calculation resulted with exception: " + exception.getMessage());
    }

}