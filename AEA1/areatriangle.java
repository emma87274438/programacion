import java.util.Scanner; 

public class areatriangle {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
         System.out.print("Ingrese el primer valor: "); 
         double base = lector.nextDouble(); 
         System.out.print("Ingrese el segundo valor: "); 
        double altura = lector.nextDouble(); 
        double total = base*altura/2;
         System.out.println("El resultado es: " + total); 
    }

}