package ObjectOriented20;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("Manufacturer 1", 0.34567, "GREEN");
        fan.switchOn();
        System.out.println("Turning on");
        System.out.println(fan);
        fan.switchOff();
        System.out.println("Turning off");
        System.out.println(fan);
    }
}
