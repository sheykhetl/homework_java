public final class dish implements item {

    private String name;
    private String description;
    private int price;

    public dish(String name, String description, int price) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name can't be empty");
        }
        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("description can't be empty");
        }
        if (price < 0) {
            throw new IllegalArgumentException("price can't be less than 0");
        }
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int getPrice() {
        return price;
    }
}