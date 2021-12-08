import java.awt.*;
import java.util.Random;

public class game_model {

    final int CELL_SIZE = 20;
    final int CANVAS_WIDTH = 30;
    final int CANVAS_HEIGHT = 20;
    final int START_SNAKE_SIZE = 5;
    final int START_SNAKE_X = CANVAS_WIDTH / 2;
    final int START_SNAKE_Y = CANVAS_HEIGHT / 2;
    final Color SNAKE_COLOR = Color.green;
    final Color FOOD_COLOR = Color.red;
    final Color BACKGROUND_COLOR = Color.black;
    final int SNAKE_DELAY = 150;

    private Random random;
    private snake Snake;
    private food food;

    private boolean gameOver = false;

    public game_model() {
        this.random = new Random();
        this.Snake = new snake(
                START_SNAKE_X,
                START_SNAKE_Y,
                START_SNAKE_SIZE,
                snake.Direction.RIGHT,
                this);
        this.food = new food(this);
    }

    public boolean isCoordinatesBusy(int x, int y) {
        return Snake.isInSnake(x, y);
    }

    public Random getRandom() {
        return random;
    }

    public snake getSnake() {
        return Snake;
    }

    public void setDirection(int code) {
        Snake.setDirection(code);
    }

    public food getFood() {
        return food;
    }

    public void updateFood() {
        food.update();
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public void move() {
        Snake.move();
    }
}