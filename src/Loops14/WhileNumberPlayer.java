package Loops14;

public class WhileNumberPlayer {
    public static void main(String[] args) {
        WhileNumberPlayer player = new WhileNumberPlayer(30);
        player.printSquaresUpToLimit();
        player.printCubesUpToLimit();
    }

    private int limit;

    public WhileNumberPlayer(int limit) {
        this.limit = limit;
    }

    public void printSquaresUpToLimit() {
        int i = 1;
        while(i * i < 30) {
            System.out.println(i * i);
            i++;
        }
    }

    public void printCubesUpToLimit() {
        int i = 1;
        while(i * i * i < 30) {
            System.out.println(i * i * i);
            i++;
        }
    }

}
