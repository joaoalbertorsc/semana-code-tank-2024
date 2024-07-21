package Aula03;

import java.util.Scanner;

public class EhPrimo {
    public static void main(String[] args) {

        int numero = 0;
        Scanner scanner = new Scanner(System.in);

        while (true){
            int divisor = 2;
            boolean ehPrimo = true;
            numero = Integer.parseInt(scanner.nextLine());
            if (numero == -1){
                break;
            } else if (numero <= 1){
                ehPrimo = false;
            } else {
                while (divisor <= numero / 2){
                    if (numero % divisor == 0){
                        ehPrimo = false;
                        break;
                    }
                    divisor++;
                }
            }
            if (ehPrimo){
                System.out.println("Numero " + numero + " é primo");
            } else {
                System.out.println("Numero " + numero + " não é primo");
            }
        }
        System.out.println("Codigo encerrado");
    }
}
