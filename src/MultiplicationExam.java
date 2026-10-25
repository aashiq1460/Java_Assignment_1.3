
import java.util.Scanner;

public class MultiplicationExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score;

        do {
            score = 0;

            for (int i = 1; i <= 10; i++) {
                int a = (int) (Math.random() * 10) + 1;
                int b = (int) (Math.random() * 10) + 1;

                System.out.print("Question " + i + ": " + a + " x " + b + " = ");
                int answer = scanner.nextInt();

                if (answer == a * b) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong! The answer is " + (a * b));
                }
            }

            System.out.println("Your score: " + score + "/10");

            if (score == 10) {
                System.out.println("Congratulations! You have mastered the multiplication tables!");
            } else {
                System.out.println("Try again! Starting a new set.");
            }

        } while (score < 10);

        scanner.close();
    }
}
