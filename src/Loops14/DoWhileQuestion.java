package Loops14;

import java.util.Scanner;

public class DoWhileQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        do {
            System.out.println("Enter a number");
            number = scanner.nextInt();
            System.out.println("Cube is " + number * number * number);

        } while (number >=0);
    }
}
