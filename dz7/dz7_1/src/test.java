public class test {
    public static void main(String[] args) {
        pan pan = new pan("pan1",17.5,20.8);
        plate plate=new plate("plate1",750);
        System.out.println(pan.getName() + "  " + pan.getDiameter() + " " + pan.height);
        System.out.println(plate.getName() + "  " + plate.getcosts());
    }
}
