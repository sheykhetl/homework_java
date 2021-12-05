package dz2_4;

public class test {
    public static void main(String[] args) {
        dog d1 = new dog("julya", 10);
        dog d2 = new dog("villi", 4);
        dog d3 = new dog("lucsor", 8);

        System.out.println(d1);
        d1.intoHumanAge();

        System.out.println("======================");

        System.out.println(d2);
        d2.intoHumanAge();

        System.out.println("======================");
        System.out.println(d3);

        d3.intoHumanAge();
    }
}
