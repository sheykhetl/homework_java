public class book {
    private String author;
    private String name;
    private int year;
    private int label;

    public book(String author, String name, int year, int label) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.label = label;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLabel() {
        return label;
    }

    public void setLabel(int price) {
        this.label = label;
    }
}
