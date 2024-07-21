package Aula04;

import java.util.Scanner;

public class InverterArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[] vetor = new char[5];
        char[] vetorInvertido;

        System.out.println("--- ESCREVA OS CARACTERES DESEJADOS ---");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o caractere para a posição " + (i+1) + " do vetor:");
            vetor[i] = scanner.nextLine().charAt(0);
        }

        vetorInvertido = inverterArray(vetor);
        System.out.println(vetorInvertido);
    }

    public static char[] inverterArray(char[] array){
        char[] arrayInvertido = new char[array.length];
        int j = 0;

        for (int i = array.length; i > 0; i--) {
            arrayInvertido[j] = array[i-1];
            j++;
        }
        return arrayInvertido;
    }
}
