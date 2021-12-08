import javax.swing.*;
import java.awt.*;

public class game_view extends JPanel {

    private snake snake;
    private food food;

    public game_view(game_model gameModel) {
        this.snake = gameModel.getSnake();
        this.food = gameModel.getFood();
        setBackground(gameModel.BACKGROUND_COLOR);
        setPreferredSize(new Dimension(
                gameModel.CELL_SIZE * gameModel.CANVAS_WIDTH - 10,
                gameModel.CELL_SIZE * gameModel.CANVAS_HEIGHT - 10));

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        snake.paint(g2D);
        food.paint(g2D);
    }
}