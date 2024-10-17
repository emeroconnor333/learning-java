import java.util.Arrays;
import java.util.Scanner;
public class GradeManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many students are there? ");
        int n = input.nextInt();
        input.nextLine();

        String names[] = new String[n];
        int grades[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter name for student %d: ", i + 1);
            names[i] = input.nextLine();

            System.out.printf("Enter grade for student %d: ", i + 1);
            grades[i] = input.nextInt();
            input.nextLine();
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%s: %d%%%n", names[i], grades[i]);
        }

        //average grade
        double average = Arrays.stream(grades).average().orElse(0);
        System.out.printf("Average grade: %.0f%%%n", average);

        //highest grade
        int max = Arrays.stream(grades).max().orElse(Integer.MIN_VALUE);
        System.out.printf("Highest grade: %d%%%n", max);

        //lowest grade
        int min = Arrays.stream(grades).min().orElse(Integer.MIN_VALUE);
        System.out.printf("Lowest grade: %d%%%n", min);
    }
}
