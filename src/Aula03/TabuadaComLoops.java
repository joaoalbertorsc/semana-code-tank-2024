package Aula03;

import java.util.Scanner;

public class TabuadaComLoops {
    public static void main(String[] args) {

        int num;
        int i;
        int result;

        Scanner scanner = new Scanner(System.in);

        i = 1;
        num = Integer.parseInt(scanner.nextLine());

        while (i < 11){
            result = num * i;
            System.out.println(num + " X " + i + " = " + result);
            i++;
        }
//        do {
//            result = num * i;
//            System.out.println(num + " X " + i + " = " + result);
//            i++;
//        } while (i < 11);
//
//        for (i = 0; i < 11; i++){
//            result = num * i;
//            System.out.println(num + " X " + i + " = " + result);
//        }
    }
}
