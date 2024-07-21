package Aula03;

import java.util.Scanner;

public class CalculoPopulacional {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double salarioDoHabitanteAtual;
        int filhosDoHabitanteAtual;

        double mediaSalarioPopulacao;
        int mediaFilhosPorHabitante;
        double maiorSalario = 0;
        double percentualHabitantesSalarioInferior150;

        int somaTotalHabitantes = 0;
        int somaTotalHabitantesSalarioInferior150 = 0;
        int somaTotalFilhos = 0;
        double somaTotalSalarios = 0;

        int i = 0;

        while (true){
            i++;
            System.out.println("Para finalizar o programa escreva um SALARIO com valor negativo.");
            System.out.println("Digite o salario do habitante " + i + ":");
            salarioDoHabitanteAtual = Double.parseDouble(scanner.nextLine());

            // sair do programa
            if (salarioDoHabitanteAtual < 0){
                break;
            }
            if (salarioDoHabitanteAtual > maiorSalario){
                maiorSalario = salarioDoHabitanteAtual;
            }
            if (salarioDoHabitanteAtual < 150){
                somaTotalHabitantesSalarioInferior150++;
            }
            somaTotalHabitantes++;
            somaTotalSalarios += salarioDoHabitanteAtual;

            System.out.println("Digite o total de filhos do habitante " + i + ":");
            filhosDoHabitanteAtual = Integer.parseInt(scanner.nextLine());
            somaTotalFilhos += filhosDoHabitanteAtual;
        }

        mediaSalarioPopulacao = media(somaTotalSalarios, somaTotalHabitantes);
        mediaFilhosPorHabitante = media(somaTotalFilhos, somaTotalHabitantes);
        percentualHabitantesSalarioInferior150 = percentual(somaTotalHabitantes, somaTotalHabitantesSalarioInferior150);

        System.out.println("Média de salario da população: " + mediaSalarioPopulacao +".");
        System.out.println("Média de numero de filhos: " + mediaFilhosPorHabitante +".");
        System.out.println("Maior salario: " + maiorSalario +".");
        System.out.println("Percentual pessoas com salario inferior a R$150,00: " + percentualHabitantesSalarioInferior150 + "%.");
    }

    private static double media(double dividendo, int divisor) {
        return dividendo / divisor;
    }
    private static int media(int dividendo, int divisor) {
        return dividendo / divisor;
    }
    private static double percentual(double total, double fatia) {
        return (fatia * 100) / total;
    }

}
