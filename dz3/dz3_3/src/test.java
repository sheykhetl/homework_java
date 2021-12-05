public class test {
    public static void main(String[] args) {

        book book1 = new book("Эрих Мария Ремарк", "Три товарища", 1936, 544);
        System.out.println(book1.getAuthor() + " " + book1.getName() + " " + book1.getYear() + " " + book1.getLabel());
    }
}
