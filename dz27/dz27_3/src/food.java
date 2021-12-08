public class food extends cell {

    private game_model gameModel;

    public food(game_model gameModel) {
        super(-1, -1, gameModel.CELL_SIZE, gameModel.FOOD_COLOR);
        this.gameModel = gameModel;
        update();
    }

    public boolean isFood(int x, int y) {
        return (this.x == x) && (this.y == y);
    }

    public void update() {
        int x, y;
        do {
            x = gameModel.getRandom().nextInt(gameModel.CANVAS_WIDTH);
            y = gameModel.getRandom().nextInt(gameModel.CANVAS_HEIGHT);
        } while (gameModel.isCoordinatesBusy(x, y));
        set(x, y);
    }
}