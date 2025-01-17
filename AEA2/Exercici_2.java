package AEA2;


public class Exercici_2 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese la longitud de los vectores: ");
         int length = scanner.nextInt();9
        
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

        System.out.print("Ingrese un valor a buscar en  el primer vector: ");
        int valorBuscado = scanner.nextInt();
        
        boolean found = false;
        for (int i = 0; i < length; i++) {
            if (vector1[i] == valorBuscado) {
                System.out.println("El valor " + valorBuscado + " se encuentra en la posición " + (i + 1) + " del primer vector.");
                found = true;
               
            }
        }
        if (!found) {
            System.out.println("El valor " + valorBuscado + " no se encuentra en el primer vector.");
        }
        
        
    }
}