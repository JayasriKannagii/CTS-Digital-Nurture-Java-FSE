import java.util.Random;
import java.util.Scanner;

public class Numberguessing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // random number between 1 to 100
        int number = rand.nextInt(100) + 1;

        int guess = 0;

        System.out.println("🎮 Welcome to Number Guessing Game!");
        System.out.println("Guess a number between 1 to 100");

        while (guess != number) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too High 📈");
            }
            else if (guess < number) {
                System.out.println("Too Low 📉");
            }
            else {
                System.out.println("Correct 🎉 You Win!");
            }
        }

        sc.close();
    }
}