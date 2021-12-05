package dz2_3;

public class test {

        public static void main(String[] args) {

            book b1 = new book("Гарри Поттер и философский камень", "Джоан Роулинг", 432, 499);

            System.out.println(b1);

            System.out.println("==========================");

            b1.getInfoBook();
        }
}
