public class Test3 {
    public static void main(String[] args) {

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(hourOfDay < 8 && hourOfDay > 22) {
            barking = true;
            return barking;
        } else if(hourOfDay < 0 && hourOfDay > 23) {
            barking = false;
            return barking;
        } else {
            return false;
        }
    }
}
