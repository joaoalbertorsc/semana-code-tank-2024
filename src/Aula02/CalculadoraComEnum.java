package Aula02;

import java.util.Scanner;

public class CalculadoraComEnum {
    enum OperacaoMatematica{
        SOMA{
            @Override
            public double operation(double a, double b){
                return a + b;
            }
        }, SUBTRACAO{
            @Override
            public double operation(double a, double b){
                return a - b;
            }
        }, MULTIPLICACAO{
            @Override
            public double operation(double a, double b){
                return a * b;
            }
        }, DIVISAO{
            @Override
            public double operation(double a, double b){
                if (b == 0){
                    return -1;
                } else return a / b;
            }
        };
        public abstract double operation(double a, double b);
    }
    public static void main(String[] args) {

        double a;
        double b;
        double resultado;
        char selectedOperation;
        Scanner scanner = new Scanner(System.in);

        System.out.println("First value:");
        a = Double.parseDouble(scanner.nextLine());
        System.out.println("Second value:");
        b = Double.parseDouble(scanner.nextLine());
        System.out.println("Select the operation\n" +
                "[+] [-] [*] [/]");
        selectedOperation = scanner.nextLine().charAt(0);

        resultado = switch (selectedOperation) {
            case '+' -> OperacaoMatematica.SOMA.operation(a, b);
            case '-' -> OperacaoMatematica.SUBTRACAO.operation(a, b);
            case '/' -> OperacaoMatematica.DIVISAO.operation(a, b);
            case '*' -> OperacaoMatematica.MULTIPLICACAO.operation(a, b);
            default -> throw new IllegalStateException("Unexpected value: " + selectedOperation);
        };
        if (b == 0) {
            System.out.println("Error: impossible to divide by zero.");
        } else {
            System.out.println("Final result is " + resultado);
        }
    }
}
