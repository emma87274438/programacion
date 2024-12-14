
import java.util.Scanner;

public class taulamultiplicarenrere {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.print(" De que numero quieres obtener la tambla de multiplicar?");
        int x =lector.nextInt();
        int i = 10;
        while (i >= 1){
            System.out.println(x + "x" + i + "=" + (x * i));
            i--;
        }
        System.out.print("esta es la tabla de multuplicar del numero" + x);
    }
    
}