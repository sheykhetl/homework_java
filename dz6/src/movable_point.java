public class movable_point implements movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public movable_point(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "movable_point{" +
                "x = " + x +
                ", y = " + y +
                ", xSpeed = " + xSpeed +
                ", ySpeed = " + ySpeed +
                '}';
    }

    public void moveUp() {
    }

    ;

    public void moveDown() {
    }

    ;

    public void moveLeft() {
    }

    ;

    public void moveRight() {
    }

    ;
}