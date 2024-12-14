import java.util.Scanner; 

public class multiplicacio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in); 
        System.out.print("Ingrese el primer valor: "); 
        double x = lector.nextDouble(); 
        System.out.print("Ingrese el segundo valor: "); 
        double y = lector.nextDouble(); 
        System.out.print("Ingrese el tercer valor");
        double z = lector.nextDouble();
        double total = x * y * z;
        System.out.println("El resultado es: " + total); 
    }
}

