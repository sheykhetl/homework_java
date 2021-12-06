import org.junit.Test;
import exception_demo;
public class exception_demo_test {

    @Test(expected = ArithmeticException.class)
    public void testInteger_zero() {
        exception_demo object = new exception_demo();
        object.integer_zero();
    }

    @Test
    public void testDouble_zero() {
        exception_demo object = new exception_demo();
        object.double_zero();
    }
}