public abstract class movable_circle implements movable {

    private int radius;
    private movable_point center;

    public movable_circle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        center.x = x;
        center.y = y;
        center.xSpeed = xSpeed;
        center.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "movable_circle{" +
                "radius = " + radius +
                ", center = " + center +
                '}';
    }

    public void moveUp() {
    }

    public void moveDown() {
    }

    public void moveLeft() {
    }

    public void moveRight() {
    }

}