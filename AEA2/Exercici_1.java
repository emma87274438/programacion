package AEA2;
import java.util.Scanner;

public class Exercici_1 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese la longitud de los vectores: ");
         int length = scanner.nextInt();
              int[] vector1 = new int[length];
             int[] vector2 = new int[length];
              int[] Suma = new int[length];

        System.out.println("Ingrese los elementos del primer vector:");
            for (int i = 0; i < length; i++) {
                System.out.print("Elemento " + (i + 1) + ":");
                    vector1[i] = scanner.nextInt();
        }
        

         System.out.println("Ingrese los elementos del segundo vector:");
        for (int i = 0; i < length; i++) {
            System.out.print("Elemento " + (i + 1) + ":");
                vector2[i] = scanner.nextInt();
        }
        

        for (int i = 0; i < length; i++) {
            Suma[i] = vector1[i] + vector2[i];
        }
        
        System.out.println("El vector resultante de la suma es:");
        for (int i = 0; i < length; i++) {
            System.out.print(Suma[i]);
        }
        System.out.println(); 
        }
        
     }
    