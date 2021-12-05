public abstract class square extends rectangle {
    protected double side;

    public square(double side) {
        this.side = side;
    }

    public square(double width, double length, double side) {
        super(width, length);
        this.side = side;
    }

    public square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
}