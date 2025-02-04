import java.util.Scanner;

public class trobarmaximinv2 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] array = {12,3,45,-3,65,-5,88,99,2,23,54,33,27,53,96,0};
        
            int lowestnum = array[0];
        
            int highestnum = array[0];
        
                for (int i = 0; i < array.length; i++){
                    if (highestnum < array[i]){
                    lowestnum = highestnum;
                    highestnum = array[i];
                    }
                }
        
    
            double minima = calcularmaximinv2.calcularMinimo(notas);
            double maxima = calcularmaximinv2.calcularMaximo(notas);
    
            
            System.out.println("\nResultados:");
            System.out.println("Nota mínima: " + minima);
            System.out.println("Nota máxima: " + maxima);
    
            scanner.close();
    
        }   
}
