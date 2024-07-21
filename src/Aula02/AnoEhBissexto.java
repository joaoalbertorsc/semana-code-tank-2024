package Aula02;

import java.util.Scanner;

public class AnoEhBissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ano;

        while (true){
            System.out.println("Digite o ano que você quer verificar:");
            ano = Integer.parseInt(scanner.nextLine());
            if (ano < 0) {
                break;
            } else if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
                System.out.println("O ano " + ano + " É um ano bissexto.");
            } else System.out.println("O ano " + ano + " NÃO um ano bissexto.");
        }
        System.out.println("Sistema finalizado");
    }
}
