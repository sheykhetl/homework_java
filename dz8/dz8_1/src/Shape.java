import java.awt.*;

public abstract class Shape {

    public interface Supplier {

        Shape get(Color color, int x, int y);

    }

    public Color getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private Color color;
    private int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
}