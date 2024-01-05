package ObjectOriented20.interfaces;

public class GameRunner {
    public static void main(String[] args) {
        ChestGame game = new ChestGame();
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
