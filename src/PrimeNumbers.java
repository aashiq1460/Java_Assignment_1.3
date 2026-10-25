
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = scanner.nextInt();

        System.out.print("Enter end: ");
        int end = scanner.nextInt();

        for (int number = start; number <= end; number++) {
            if (number < 2) {
                continue;
            }

            boolean isPrime = true;

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number);
            }
        }

        scanner.close();
    }
}
