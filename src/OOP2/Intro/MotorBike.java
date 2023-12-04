package OOP2.Intro;

public class MotorBike {
    //state
    private int speed;

    //default constructor
    public MotorBike() {
        this(0); //calling constructor inside no params constructor
    }

    public MotorBike(int speed) {
        this.speed = speed;
    }

    //behaviour
    public void start() {
        System.out.println("Bike started");
    }

    public void setSpeed(int speed) {
        if(speed > 0)
        this.speed = speed;

    }

     public int getSpeed() {
        return this.speed;
    }

    public void increaseSpeed(int howMuch) {
        setSpeed(this.speed + howMuch);
    }

    public void decreaseSpeed(int howMuch) {
        setSpeed(this.speed - howMuch);
    }
}
