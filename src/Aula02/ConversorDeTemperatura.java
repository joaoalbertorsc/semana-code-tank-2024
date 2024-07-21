package Aula02;

import java.util.Scanner;

public class ConversorDeTemperatura {
    enum Temperatures{
        CELSIUS {
            @Override
            public double conversion(double actualTemp, char converToTemp) {
                return switch (converToTemp){
                    case 'f' -> (actualTemp * 9 / 5) + 32;
                    case 'k' -> actualTemp + 273.15;
                    default -> throw new IllegalStateException("Unexpected value: " + converToTemp);
                };
            }
        }, FAHRENHEIT {
            @Override
            public double conversion(double actualTemp, char converToTemp) {
                return switch (converToTemp){
                    case 'c' -> (actualTemp - 32) * 5 / 9;
                    case 'k' -> (actualTemp - 459.67) * 5 / 9;
                    default -> throw new IllegalStateException("Unexpected value: " + converToTemp);
                };
            }
        }, KELVIN {
            @Override
            public double conversion(double actualTemp, char converToTemp) {
                return switch (converToTemp){
                    case 'c' -> actualTemp - 273.15;
                    case 'k' -> (actualTemp * 9 / 5) - 459.67;
                    default -> throw new IllegalStateException("Unexpected value: " + converToTemp);
                };
            }
        };
        public abstract double conversion(double actualTemp, char converToTemp);
    }

    public static void main(String[] args) {
        double actualTemperature;
        char actualTemperatureType;
        char convertTempTo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your actual temperature:");
        actualTemperature = Double.parseDouble(scanner.nextLine());
        System.out.println("""
                Which temperature unity you used?
                Celsius --- Fahrenheit --- Kelvin
                Type your actual unity:""");
        actualTemperatureType = scanner.nextLine().charAt(0);
        System.out.println("""
                To which temperature unity you want to convert?
                Celsius --- Fahrenheit --- Kelvin
                Type the the one you want:""");
        convertTempTo = scanner.nextLine().charAt(0);

        System.out.println("The conversion is:");
        switch (Character.toLowerCase(actualTemperatureType)){
            case 'c' -> System.out.println(Temperatures.CELSIUS.conversion(actualTemperature, convertTempTo));
            case 'f' -> System.out.println(Temperatures.FAHRENHEIT.conversion(actualTemperature, convertTempTo));
            case 'k' -> System.out.println(Temperatures.KELVIN.conversion(actualTemperature, convertTempTo));
        }

    }
}
