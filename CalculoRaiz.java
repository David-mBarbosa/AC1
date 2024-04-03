package AC1.ExerciciosAula4;

import java.util.Scanner;

public class CalculoRaiz {

    public static void main(String[] args) {
        System.out.println("Calculo de Raiz cúbica");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
            double numero = scanner.nextDouble();
            double Raiz = Math.cbrt(numero);
        System.out.println("A raiz e " + Raiz);

        scanner.close();
    }
    
}
