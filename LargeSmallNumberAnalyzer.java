import java.util.Scanner;

public class LargeSmallNumberAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        char ch;
        do {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }

            sum += number;
            count++;

            System.out.print("Do you want to enter another number? (y/n): ");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }

        sc.close();
    }
}