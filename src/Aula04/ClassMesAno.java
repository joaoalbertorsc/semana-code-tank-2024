package Aula04;

import java.util.Scanner;

public class ClassMesAno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MesAno mes;
        int ano;

        System.out.println("Digite o ano desejado:");
        ano = Integer.parseInt(scanner.nextLine());
        System.out.println("Escreva o mês desejado:");
        mes = switch (scanner.nextLine().toLowerCase()){
            case "janeiro" -> MesAno.JANEIRO;
            case "fevereiro" -> MesAno.FEVEREIRO;
            case "março" -> MesAno.MARCO;
            case "abril" -> MesAno.ABRIL;
            case "maio" -> MesAno.MAIO;
            case "junho" -> MesAno.JUNHO;
            case "julho" -> MesAno.JULHO;
            case "agosto" -> MesAno.AGOSTO;
            case "setembro" -> MesAno.SETEMBRO;
            case "outubro" -> MesAno.OUTUBRO;
            case "novembro" -> MesAno.NOVEMBRO;
            case "dezembro" -> MesAno.DEZEMBRO;
            default -> throw new IllegalStateException("Entrada inesperada: " + scanner.nextLine());
        };
        diasDoMesEAnoEhBissexto(mes, ano);
        scanner.close();
    }
    enum MesAno{
        JANEIRO, FEVEREIRO, MARCO, ABRIL, MAIO, JUNHO, JULHO, AGOSTO, SETEMBRO, OUTUBRO, NOVEMBRO, DEZEMBRO
    }
    public static void diasDoMesEAnoEhBissexto(MesAno mesAno, int ano){
        int dias = switch (mesAno){
            case JANEIRO -> 31;
            case FEVEREIRO -> 28;
            case MARCO -> 31;
            case ABRIL -> 30;
            case MAIO -> 31;
            case JUNHO -> 30;
            case JULHO -> 31;
            case AGOSTO -> 31;
            case SETEMBRO -> 30;
            case OUTUBRO -> 31;
            case NOVEMBRO -> 30;
            case DEZEMBRO -> 31;
        };
        System.out.println("O mês de " + mesAno + " possui " + dias + " e o ano " + ano + " " + ehBissexto(ano));
    }


    private static String ehBissexto(int ano) {
        if (ano < 0) {
            return "Erro: ano invalido.";
        } else if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            return "É um ano bissexto.";
        } else return "NÃO um ano bissexto.";
    }
}
