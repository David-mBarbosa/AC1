package AC1.ExerciciosAula4;

import java.util.Scanner;

public class ConverterCelsiusparaFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Celsius;
        System.out.println("Convertor de celsius para fahrenheit");
        System.out.println("Digite a temperatura em Celsius");
            Celsius = scanner.nextDouble();
            double Conversão = (Celsius*9/5) + 32;
        System.out.println("A temperatura em Fahrenheit e " + Conversão);

        scanner.close();
    }
}
