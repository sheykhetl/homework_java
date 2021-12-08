import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pay_card implements strategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private credit_card card;

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("enter the card number: ");
            String number = READER.readLine();
            System.out.print("enter the card expiration date 'mm/yy': ");
            String date = READER.readLine();
            System.out.print("enter the CVV code: ");
            String cvv = READER.readLine();
            card = new credit_card(number, date, cvv);

            // Validate credit card number...

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("paying " + paymentAmount + " using credit card.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}