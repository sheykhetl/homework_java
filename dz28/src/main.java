import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class main {
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static order order = new order();
    private static strategy strategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;

            String continueChoice;
            do {
                System.out.print("please, select a product:" + "\n" +
                        "1 - mother board" + "\n" +
                        "2 - CPU" + "\n" +
                        "3 - HDD" + "\n" +
                        "4 - memory" + "\n");
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.print("count: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.print("do you wish to continue selecting products? Y/N: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("please, select a payment method:" + "\n" +
                        "1 - PalPay" + "\n" +
                        "2 - credit card");
                String paymentMethod = reader.readLine();

                if (paymentMethod.equals("1")) {
                    strategy = new pay_PayPal();
                } else {
                    strategy = new pay_card();
                }
            }

            order.processOrder(strategy);

            System.out.print("pay " + order.getTotalCost() + " units or continue shopping? P/C: ");
            String proceed = reader.readLine();
            if (proceed.equalsIgnoreCase("P")) {
                if (strategy.pay(order.getTotalCost())) {
                    System.out.println("payment has been successful.");
                } else {
                    System.out.println("fail! please, check your data.");
                }
                order.setClosed();
            }
        }
    }
}