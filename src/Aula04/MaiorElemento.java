package Aula04;

import java.util.Scanner;

public class MaiorElemento {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] array = new double[5];

        System.out.println("--- MAIOR ELEMENTO ---");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite o número da posição " + (i+1) + ":");
            array[i] = Double.parseDouble(scanner.nextLine());
        }

        System.out.println("O maior elemento é: " + maiorNumeroDoArray(array));
    }
    public static double maiorNumeroDoArray(double[] array){
        double maiorNumero = 0;
        for (double numero : array){
            if (numero > maiorNumero){
                maiorNumero = numero;
            }
        }
        return maiorNumero;
    }
}
