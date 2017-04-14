import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Welcome to the Grand Circus Dice Simulator");
        String contPrompt;

        do {
            System.out.println("Please enter the number of sides for the pair of dice: ");
            int numSides = scan.nextInt();

            System.out.println("Ready to roll? Type (r)");

            String input = scan.next();

            input.equalsIgnoreCase("R");

            System.out.println(rnd.nextInt(numSides) + 1);
            System.out.println(rnd.nextInt(numSides) + 1);

            System.out.println("Do you want to Roll again? (y/n)");


        } while (contPrompt.equalsIgnoreCase("Y"));

    }

}
