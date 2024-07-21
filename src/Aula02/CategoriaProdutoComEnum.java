package Aula02;

import java.util.Scanner;

public class CategoriaProdutoComEnum {
    public static void main(String[] args) {
        enum CategoriaDeProduto{
            ELETRONICO{
                @Override
                public void imprimir(){
                    System.out.println("Eletronico selecionado");
                }
            }, VESTUARIO{
                @Override
                public void imprimir(){
                    System.out.println("Vestuario selecionado");
                }
            }, ALIMENTO{
                @Override
                public void imprimir(){
                    System.out.println("Alimento selecionado");
                }
            };
            public abstract void imprimir();
        }

        CategoriaDeProduto categoriaDeProduto = null;
        char categoriaSelecionada;

        System.out.println("Escreva o tipo de produto selecionado:\n" +
                "Alimento -- Eletronico -- Vestuario");
        Scanner scanner = new Scanner(System.in);

        categoriaSelecionada = scanner.nextLine().charAt(0);

        switch (Character.toLowerCase(categoriaSelecionada)){
            case 'e' -> CategoriaDeProduto.ELETRONICO.imprimir();
            case 'v' -> CategoriaDeProduto.VESTUARIO.imprimir();
            case 'a' -> CategoriaDeProduto.ALIMENTO.imprimir();
        }
    }
}
