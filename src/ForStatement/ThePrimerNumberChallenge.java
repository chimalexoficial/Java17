package ForStatement;

public class ThePrimerNumberChallenge {
    public static void main(String[] args) {
        int count = 0;

        for(int i = 10; i <= 50; i++) {
            if(isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                count++;
            }
        }
        System.out.println("Total is " + count);
    }

    public static boolean isPrime(int wholeNumber) {
        if(wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for(int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if(wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
