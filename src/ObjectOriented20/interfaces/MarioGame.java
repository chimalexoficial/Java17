package ObjectOriented20.interfaces;

public class MarioGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Hole");
    }

    @Override
    public void left() {

    }

    @Override
    public void right() {
        System.out.println("Go forward");
    }
}
