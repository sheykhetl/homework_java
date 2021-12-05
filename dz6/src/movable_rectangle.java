public class movable_rectangle extends rectangle implements movable {

    private movable_point topLeft;
    private movable_point bottomRight;

    public void moveUp() {

    }

    public void moveDown() {
    }

    public void moveLeft() {

    }

    public void moveRight() {

    }

    public movable_rectangle(double width, double length) {
        super(width, length);
    }

    public movable_rectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft.x = x1;
        topLeft.y = y1;
        topLeft.xSpeed = xSpeed;
        topLeft.ySpeed = ySpeed;
        bottomRight.x = x2;
        bottomRight.y = y2;
        bottomRight.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;
    }

    public boolean Check() {
        if ((bottomRight.xSpeed == topLeft.xSpeed) && (bottomRight.ySpeed == topLeft.ySpeed)) {
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "movable_rectangle{" +
                "topLeft = " + topLeft +
                ", buttomRight = " + bottomRight +
                '}';
    }


}