import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the number guessing game!");

        System.out.print("Choose a lower limit: ");
        int lowerLimit = input.nextInt();

        System.out.print("Choose an upper limit: ");
        int upperLimit = input.nextInt();

        double num = Math.floor(Math.random() * (upperLimit - lowerLimit) + lowerLimit);

        boolean cont = true;
        int attempts = 0;
        while (cont) {
            System.out.print("Guess the number: ");
            int guess = input.nextInt();

            if (guess > num) {
                System.out.println("Too high! Try again.");
                System.out.printf("Attempts made: %d%n", ++attempts);
            }
            else if (guess < num) {
                System.out.println("Too low! Try again.");
                System.out.printf("Attempts made: %d%n", ++attempts);
            }
            else {
                System.out.println("You got it!");
                cont = false;
            }
        }
    }
}
