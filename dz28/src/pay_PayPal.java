import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class pay_PayPal implements strategy {
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static {
        DATA_BASE.put("amanda1985", "amanda@ya.com");
        DATA_BASE.put("qwerty", "john@amazon.eu");
    }


    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.print("enter the user's email: ");
                email = READER.readLine();
                System.out.print("enter the password: ");
                password = READER.readLine();
                if (verify()) {
                    System.out.println("data verification has been successful.");
                } else {
                    System.out.println("wrong email or password!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean verify() {
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }


    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("paying " + paymentAmount + " using PayPal.");
            return true;
        } else {
            return false;
        }
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}