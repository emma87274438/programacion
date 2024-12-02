import java.util.Scanner; 

public class descuento { 
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.print("cual es el precio del producto?");
        float precio = lector.nextFloat();
        if (precio >= 95){
            float descuento = precio *15/100;
            precio = precio - descuento;
        }
        System.out.print("el total es:" * precio);
    }
} 