package Aula02;

import java.util.Scanner;

public class CompararTresNumeros {
    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int result;

        Scanner scanner = new Scanner(System.in);
        a = Integer.parseInt(scanner.nextLine());
        b = Integer.parseInt(scanner.nextLine());
        c = Integer.parseInt(scanner.nextLine());
        result = (a > b ? a : b) > c ? (a > b ? a : b) : c;

        System.out.println(result);
    }
}
