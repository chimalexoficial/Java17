public class Test2 {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int kbToMb = kiloBytes / 1024;
        int mod = kiloBytes % 1024;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
        System.out.println(kiloBytes + " KB = " + kbToMb + " MB and " + mod + " KB");
        }
    }
}
