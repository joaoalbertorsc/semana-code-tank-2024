package Aula03;

import java.util.Random;
import java.util.Scanner;

public class AdivinheONumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guessNumber;
        int goalNumber;
        int i = 0;
        Random random = new Random();

        goalNumber = random.nextInt(10);
        while (true) {
            System.out.println("Guess your number:");
            guessNumber = Integer.parseInt(scanner.nextLine());
            i++;

            if (goalNumber == guessNumber){
                System.out.println("You used " + i + " attempts to hit the Goal Number.\n" +
                        "Congratulations! You are the best!");
                break;
            } else {
                System.out.println("You missed!\n" +
                        "This is the " + i + " try.");
            }
        }
    }
}
