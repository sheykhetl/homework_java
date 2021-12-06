public class main {

    public static void main(String[] args) {
        exception_demo demo = new exception_demo();
        System.out.println("division by 0");
        try {
            demo.integer_zero();
        } catch (Exception e) {
            System.out.println("error occurred: exception called");
        } finally {
            System.out.println("division by 0 ended\n");
        }

        System.out.println("division by 0.0");
        try {
            demo.double_zero();
            System.out.println("done. no errors occurred");
        } catch (Exception e) {
            System.out.println("error occurred: exception called");
        } finally {
            System.out.println("division by 0.0 ended\n");
        }
    }

}