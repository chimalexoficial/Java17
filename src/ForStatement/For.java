package ForStatement;

public class For {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        System.out.println("10,000 at 2% interest " + calculateInterest(1000.00, 2.00));
        for (double rate = 2.0; rate < 5.0; rate++) {
            double interestAmount = calculateInterest(1000.00, rate);
            System.out.println("10,000 at " + rate + "% interest " + interestAmount);
        }

        for (double i = 7.5; i <= 10; i = i + 0.25) {
            double interestAmount = calculateInterest(100, i);
            if(interestAmount > 8.5) {
                break;
            }
            System.out.println("$100 at " + i + " interest is " + interestAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
