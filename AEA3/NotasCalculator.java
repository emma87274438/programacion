import java.util.Scanner;


public class NotasCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];

        
        System.out.println("Ingrese 5 notas:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        
        double minima = NotasOperaciones.calcularMinimo(notas);
        double maxima = NotasOperaciones.calcularMaximo(notas);
        double media = NotasOperaciones.calcularMedia(notas);

        
        System.out.println("\nResultados:");
        System.out.println("Nota mínima: " + minima);
        System.out.println("Nota máxima: " + maxima);
        System.out.println("Nota media: " + media);

        scanner.close();
    }
}