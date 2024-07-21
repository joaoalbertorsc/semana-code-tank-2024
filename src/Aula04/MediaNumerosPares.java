package Aula04;

import java.util.Scanner;

public class MediaNumerosPares {
    public static void main(String[] args) {

        double mediaDosNumerosPares;
        int[] arrayDeNumeros = new int[10];
        Scanner scanner = new Scanner(System.in);
        int j = 0;

        System.out.println("--- ADICIONE OS LOGO NÚMEROS ABAIXO ---");
        for (int i = 0; i < arrayDeNumeros.length; i++) {
            j++;
            System.out.println("Adicione o número da posição " + j + ":");
            arrayDeNumeros[i] = Integer.parseInt(scanner.nextLine());
        }

        mediaDosNumerosPares = media(arrayDeNumeros);

        System.out.println("A média dos números pares inseridos é:");
        System.out.println(mediaDosNumerosPares);

    }
    public static double media(int [] arrayDeNumeros) {
        double totalNumerosPares = 0;
        double somaTotalNumerosPares = 0;

        for (int numero : arrayDeNumeros) {
            if (numero % 2 == 0) {
                totalNumerosPares++;
                somaTotalNumerosPares += numero;
            }
        }
        return somaTotalNumerosPares / totalNumerosPares;

    }
}
