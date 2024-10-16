import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char cont = 'y';

        while (cont == 'y' || cont == 'Y') {
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();

            System.out.print("Choose an operation (+, -, *, /): ");
            char operation = input.next().charAt(0);
            while (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
                System.out.println("Invalid operation. Choose an operation (+, -, *, /): ");
                operation = input.next().charAt(0);
            }

            System.out.print("Enter second number: ");
            int num2 = input.nextInt();

            int result = 0;

            if (operation == '+') {
                result = num1 + num2;
            }
            else if (operation == '-') {
                result = num1 - num2;
            }
            else if (operation == '*') {
                result = num1 * num2;
            }
            else if (operation == '/') {
                while (num2 == 0) {
                    System.out.print("Cannot divide by zero. Enter another number: ");
                    num2 = input.nextInt();
                }
                result = num1 / num2;
            }
            System.out.printf("%d %c %d = %d%n", num1, operation, num2, result);
            System.out.print("Would you like to do another calculation? (y/n) ");
            cont = input.next().charAt(0);
        }
    }
}