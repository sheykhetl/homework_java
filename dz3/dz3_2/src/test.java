public class test {
    public static void main(String[] args) {

        hand hand = new hand(58);
        head head = new head("brown", 3);
        leg leg = new leg(38);

        System.out.println(hand.toString());
        System.out.println(head.toString());
        System.out.println(leg.toString());

    }
}
