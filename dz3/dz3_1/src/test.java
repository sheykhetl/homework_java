public class test {
    public static void main(String[] args) {

        circle circle1 = new circle(6, 3 , "circle");
        circle circle2 = new circle(12.7, 2, "little circle");
        circle circle3 = new circle(14.14, 8, "big circle");

        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        System.out.println(circle3.toString());

    }
}
