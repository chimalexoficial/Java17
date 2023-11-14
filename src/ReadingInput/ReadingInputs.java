package ReadingInput;

import java.util.Scanner;

public class ReadingInputs {
    public static void main(String[] args) {
        int  currentYear = 2022;
       try {
           System.out.println(getInputFromConsole(currentYear));
       } catch(NullPointerException e) {
           System.out.println(getInputFromScanner(currentYear));
       }
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, whats your name");
        System.out.println("Hi " + name + ", thanks");

        String dateOfBirth = System.console().readLine("What year were your born?");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

//        String name = System.console().readLine("Hi, whats your name");
        System.out.println("Hi, whats you your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", thanks");

//        String dateOfBirth = System.console().readLine("What year were your born?");
        System.out.println("What year were you born?");

        boolean validDOB = false;
        int age = 0;

        do {
            try {
                System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + (currentYear));
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch(NumberFormatException badUserData) {
                System.out.println("Chars not allowed");
            }
        } while (!validDOB);

        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }

        return (currentYear - dob);
    }
}
