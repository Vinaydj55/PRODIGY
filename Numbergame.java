import java.util.Scanner;

public class Numbergame 
{
    public static void main(String[] args)
    {
        guessingNumberGame();
    }

    public static void guessingNumberGame() 
    {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (100* Math.random());
        int maxAttempts = 10;
        int numberOfTries = 0;

        System.out.println("You should choose a number between 1 to 100 and try to guess the number within 5 trials.");

        for (int i = 0; i < maxAttempts; i++) 
        {
            System.out.println("Guess the number:");
            int guessNo = sc.nextInt();
            numberOfTries++;

            if (number == guessNo) 
            {
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("You took " + numberOfTries + " tries.");
                break;
            } 
            else if (number > guessNo) 
            {
                System.out.println("The number is greater than " + guessNo);
            } 
            else 
            {
                System.out.println("The number is less than " + guessNo);
            }
            if (i == maxAttempts - 1) 
            {
                System.out.println("You have exhausted your trials (" + maxAttempts + " attempts).");
                System.out.println("The number was " + number);
            }
        }
        sc.close();
    }
}
