package More;

public class Test {
    public static void main(String[] args) {
        toMilesPerHour(25.42);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1;
        } else {
           return Math.round(kilometersPerHour / 1.609344);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        long res = toMilesPerHour(kilometersPerHour);

        if(kilometersPerHour < 0) {
            System.out.println("Invalid value");
        } else if(kilometersPerHour == 0) {
            System.out.println(kilometersPerHour + " km/h" + " = " + 0 + " mi/h");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + res + " mi/h");
        }
    }
}
