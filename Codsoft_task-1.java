import java.util.Scanner;
import java.util.Random;
 class TaskCodsoft_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 5;
        int score = 0;
        
        System.out.println("Welcome to the task-1 of Codsoft.");
        System.out.println("task-1: Number Guessing Game!");

        boolean playAgain = true;
        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println();
            System.out.println("I have generated a number between " + minRange + " and " + maxRange + ".");
            int attempts = 0;
            boolean guessed = false;

            while (!guessed && attempts < maxAttempts) {
                System.out.print("Enter your guess (Attempt " + (attempts + 1) + "): ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! Your guess is correct!");
                    guessed = true;
                    score++;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too Low. Try Again.");
                } else {
                    System.out.println("Too High. Try Again.");
                }
            }

            if (!guessed) {
                System.out.println("Sorry, you have reached the maximum number of attempts. The correct number was: " + targetNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes") || playAgainInput.equals("y");
        }

        System.out.println("Thanks for playing! Your score is: " + score);
        scanner.close();
    }
}