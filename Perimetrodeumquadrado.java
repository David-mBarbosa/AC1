package AC1.ExerciciosAula4;

import java.util.Scanner;

public class Perimetrodeumquadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double perimetro;
        System.out.println("Calculo do perimetro de um quadrado");
        System.out.println("Digite a medida do lado");
        double lado = scanner.nextDouble();
        perimetro = lado*4;

        System.out.println("O perimetro do quadrado e " + perimetro);

        scanner.close();
    }
}
