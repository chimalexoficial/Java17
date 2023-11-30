package OOP2.Intro;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        //initialize motors
        ducati.start();
        honda.start();

        //set speed
        ducati.setSpeed(100);
        honda.setSpeed(0);

        ducati.increaseSpeed(100);
        honda.increaseSpeed(100);

        ducati.decreaseSpeed(1);
        honda.decreaseSpeed(2);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());

    }
}
