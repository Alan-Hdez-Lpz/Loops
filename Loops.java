import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //Assignment1
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            //Print numbers
            System.out.println(i);
            sum += i;
        }
        //Print sum
        System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for the multiplication table (1-10): ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            //Print multiplication table
            System.out.println(num + " * " + i + " = " + num * i);
        }

        //Assignment2
        sc = new Scanner(System.in);
        boolean validation = true;
        while (validation) {
            System.out.println("Enter a positive integer: ");
            int num2 = sc.nextInt();
            if (num2 > 0) {
                int totalSum = 0;
                while (num2 > 0) {
                    totalSum = totalSum + (num2 % 10);
                    num2 = num2 / 10;
                }
                System.out.println("The sum of the digits is: " + totalSum);
            }
            else {
                System.out.println("Invalid input, enter a positive integer");
            }
            System.out.println("Would you like to enter a new number (y/n): ");
            String answer = sc.next();
            if (!answer.equalsIgnoreCase("y")) {
                validation = false;
            }
        }

        //Assignment3
        validation = true;
        do{
            sc = new Scanner(System.in);
            System.out.println("Welcome to the Calculator!\n" +
                    "\n" +
                    "Please select an operation:\n" +
                    "1. Addition\n" +
                    "2. Subtraction\n" +
                    "3. Multiplication\n" +
                    "4. Division\n" +
                    "5. Exit");
            int operation = sc.nextInt();
            int firstNum = 0;
            int secondNum = 0;
            switch (operation) {
                case 1:
                    System.out.println("Enter the first number: ");
                    firstNum = sc.nextInt();
                    System.out.println("Enter the second number: ");
                    secondNum = sc.nextInt();
                    System.out.println("Result: " + firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
                    break;
                case 2:
                    System.out.println("Enter the first number: ");
                    firstNum = sc.nextInt();
                    System.out.println("Enter the second number: ");
                    secondNum = sc.nextInt();
                    System.out.println("Result: " + firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
                    break;
                case 3:
                    System.out.println("Enter the first number: ");
                    firstNum = sc.nextInt();
                    System.out.println("Enter the second number: ");
                    secondNum = sc.nextInt();
                    System.out.println("Result: " + firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
                    break;
                case 4:
                    System.out.println("Enter the first number: ");
                    firstNum = sc.nextInt();
                    System.out.println("Enter the second number: ");
                    secondNum = sc.nextInt();
                    System.out.println("Result: " + firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
                    break;
                case 5:
                    validation = false;
                    System.out.println("Exiting the calculator. Thank you!");
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
        } while (validation);
        sc.close();


    }
}
