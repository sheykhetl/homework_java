public class circle {
    private double perimeter;
    private int radius;
    private String name;

    public String getName() {
        return name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public int getRadius() {
        return radius;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "circle {" +
                "radius = " + radius +
                ", perimeter = " + perimeter +
                ", name = '" + name + '\'' +
                '}';
    }

    public circle(double perimeter, int radius, String name) {
        this.perimeter = perimeter;
        this.radius = radius;
        this.name = name;

    }
}
