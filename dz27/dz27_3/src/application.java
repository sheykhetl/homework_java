import javax.swing.*;

public class application extends JFrame {
    public application() {
        game_model gameModel = new game_model();
        game_view gameView = new game_view(gameModel);
        game_controller gameController = new game_controller(gameModel, gameView);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(gameView);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        gameController.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(application::new);
    }
}