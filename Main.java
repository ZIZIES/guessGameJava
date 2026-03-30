import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("debug mode? [true/false]");
        boolean debugstatus = scanner.nextBoolean();

        System.out.println("hey, welcome to the guessing game");
        System.out.println("what will the max number to guess be?");

        int max = scanner.nextInt();

        Random random = new Random();
        int guessnumber = random.nextInt(max) + 1;

        System.out.println("okay, I have picked a number between 1 and " + max);
        System.out.println("now try to guess it!");

              //debug stuff

        if (debugstatus)
        {
            System.out.println("number is " + guessnumber);
        }

        int guess = 0;
        int tries = 0;

        while (guess != guessnumber)
        {
            //i got this dont say i cant write java :(

            // game = good
            // graphics = good
            // cheater = ban

            tries++;
            System.out.print("Guess: ");
            guess =  scanner.nextInt();

            if (guess > guessnumber)
            {
                System.out.println("too big, try a smaller number.");
            }
            else if (guess < guessnumber)
            {
                System.out.println("too small, try a bigger number.");
            }
            else
            {
                System.out.println("you guessed it in " + tries + " " + "tries!!");
                System.out.println("press enter to exit, or sit here and admire your work...");
                scanner.nextLine();
                scanner.nextLine();
                scanner.close();
                return;
            
            }
        }
    }
} 