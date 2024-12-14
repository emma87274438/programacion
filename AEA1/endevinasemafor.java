import java.util.Random;
import java.util.Scanner;

public class endevinasemafor{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        Random random = new Random(System.currentTimeMillis());
        int numero = random.nextInt(10);

        System.out.println("Descubre el numero secreto! solo tienes 3 intentos para ganar!");
        System.out.print("Introduce un numero del 1 al 10: ");
        int intento = lector.nextInt();
        int i = 2;

        while ((i !=0) && (numero!= intento)){
            i--;
            System.out.print("Incorrecto introduce otro numero: ");
            intento = lector.nextInt();
}

if (numero == intento){
    System.out.print("Enhorabuena has ganado!");
}

else if(numero != intento){
    System.out.print("Has perdido! Vuelve a jugar");
}


}
}
