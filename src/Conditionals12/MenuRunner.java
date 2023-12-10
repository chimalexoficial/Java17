package Conditionals12;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        System.out.println("Enter number 1\n");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("The first number you entered is number " + number1);

        System.out.println("Enter number 2 \n");
        Scanner scanner2 = new Scanner(System.in);
        int number2 = scanner2.nextInt();
        System.out.println("The second number you entered is number " + number2);

        System.out.println("Enter a choice\n");
        System.out.println("1 - Add, 2 - Substract, 3 - Divide, 4 - Multiply\n");
        int choice = scanner.nextInt();

//        switch(choice) {
//            case 1:
//                System.out.println(number1 + number2);
//                break;
//            case 2:
//                System.out.println(number1 - number2);
//                break;
//            case 3:
//                System.out.println(number1 / number2);
//                break;
//            case 4:
//                System.out.println(number1 * number2);
//                break;
//            default:
//                System.out.println("No a valid option");
//                break;
//        }

        if(choice == 1) {
            System.out.println("The result is " + (number1 + number2));
        } else if(choice == 2) {
            System.out.println("The result is " + (number1 - number2));
        } else if(choice == 3) {
            System.out.println("The result is " + (number1 / number2));
        } else if(choice == 4) {
            System.out.println("The result is " + (number1 * number2));
        } else {
            System.out.println("Invalid operation");
        }

    }
}
