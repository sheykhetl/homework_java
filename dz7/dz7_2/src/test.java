public class test {
    public static void main(String[] args) {
        corgi corgi = new corgi("roni", 3);
        pug pug = new pug(11, 8);
        System.out.println(corgi.getName() + " " + corgi.getAge());
        System.out.println(pug.getOld() + " " + pug.getWeight());
    }
}
