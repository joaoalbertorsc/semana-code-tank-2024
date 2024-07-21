package Aula02;

import java.util.Scanner;

public class CategoriaDoAtleta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageAthlete;
        String categoryAthlete;

        System.out.println("Type the athlete age:");
        ageAthlete = Integer.parseInt(scanner.nextLine());
        if (ageAthlete < 18){
            categoryAthlete = "Junior";
        } else if (ageAthlete > 40) {
            categoryAthlete = "Master";
        } else categoryAthlete = "Adult";
        System.out.println(categoryAthlete);
    }
}
