package AC1.ExercícioAula5;
import java.util.Scanner;

public class CalculoNotaFacens {
    public static void main(String[] args) {
        double Peso1 = (0.15);
        double Peso2 = (0.30);
        double Peso3 = (0.10);
        double Peso4 = (0.45);
        double Pesos = (Peso1 + Peso2 + Peso3 + Peso4);
        Scanner scanner = new Scanner(System.in);
        double soma, media = 0.0;

        System.out.println("Calculadora de média FACENS");

        System.out.println("Digite a nota da AC1");
            soma = Peso1 * scanner.nextDouble();
        System.out.println("Digite a nota da AC2");
            soma = soma + Peso2 * scanner.nextDouble();
        System.out.println("Digite a nota da AG");
            soma = soma + Peso3 * scanner.nextDouble();
        System.out.println("Digite a nota da AF");
            soma = soma + Peso4 * scanner.nextDouble();

        media = soma/Pesos;
        System.out.println("A media é " + media);

        scanner.close();
        
    }
    
}
