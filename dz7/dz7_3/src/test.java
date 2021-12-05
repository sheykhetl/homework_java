public class test {
    public static void main(String[] args) {
        table table = new table("Wood", 4);
        chair chair = new chair(1, 5299);
        System.out.println(table.getMaterial() + " " + table.getSquare());
        System.out.println(chair.getCountOfLegs() + " " + chair.getCosts());
    }
}
