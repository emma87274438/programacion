import java.util.Scanner; 

public class MultiplicacionDinamica { 
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in); 
        System.out.print("Ingrese el primer valor: "); 
        double a = lector.nextDouble(); 
        System.out.print("Ingrese el segundo valor: "); 
        double b = lector.nextDouble(); 
        double total = a * b;
        System.out.println("El resultado es: " + total); 
    }
}