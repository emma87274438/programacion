import java.util.Scanner; 

public class sumarmultiplestres {

    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.print(" Hasta que valor quieres sumar multiplos de 3? ");
        int maximo =lector.nextInt();
        int i = 0;
        int total = 0;
        while (i <= maximo){
            System.out.println("sumamos" + i);
            total = total + 1;
            i = (i+3);
        }
        System.out.print(" el resultado final es: " + total);
    }
}