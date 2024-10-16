import java.util.Scanner;
public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Choose a limit: ");
        int n = input.nextInt();

        int[] array = new int[n];

        if (n > 0) {
            array[0] = 0;
            System.out.println(array[0]);
        }
        if (n > 1) {
            array[1] = 1;
            System.out.println(array[1]);
        }
        if (n > 2) {
            for (int i = 2; i < n; i++) {
                array[i] = array[i - 1] + array[i -2];
                System.out.println(array[i]);
            }
        }
    }
}
