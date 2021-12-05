public abstract class rectangle extends shape {
    protected double width;
    protected double length;

    public rectangle() {
    }

    public rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }


    public rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "rectangle{" +
                "width = " + width +
                ", length = " + length +
                '}';
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}