package AC1.ExerciciosAula4;

import java.util.Scanner;

public class Perimetrodeumretangulo {
    public static void main(String[] args) {
        double soma;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculo de um perimetro de um retangulo");
            System.out.println("Digite o valor da base do retangulo");
                soma = scanner.nextDouble();

            System.out.println("Digite a altura do retangulo");
                soma = soma*2 + scanner.nextDouble()*2;

            System.out.println("O perimetro do retangulo e " + soma);

            scanner.close();

    }
}
