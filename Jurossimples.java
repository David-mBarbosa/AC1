package AC1.ExerciciosAula4;

import java.util.Scanner;

public class Jurossimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capital;
        double taxa;
        double tempo;
            System.out.println("Calculo de Juros simples");
            System.out.println("Digite o valor do capital");
                capital=scanner.nextDouble();
            System.out.println("Digite o valor da taxa do juros, em decimais");
                taxa=scanner.nextDouble();
            System.out.println("Digite a quantidade de tempo, em anos");
                tempo=scanner.nextDouble();

                double montante = (capital*taxa*tempo);
                double juros = capital + montante;
            System.out.println("O valor acumulado de juros após " + tempo + " anos " + "na taxa de " + taxa + " e " + juros);
            
            scanner.close();
    }
}
