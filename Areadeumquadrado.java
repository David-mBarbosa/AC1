package AC1.ExerciciosAula4;

import java.util.Scanner;

public class Areadeumquadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Area;
        System.out.println("Calculo da area de um quadrado");
        System.out.println("Digite a medida do lado do quadrado");
        double lado = scanner.nextDouble();
            Area = lado*lado;

        System.out.println("A area do quadrado e " + Area);
        
        scanner.close();
    }
}
