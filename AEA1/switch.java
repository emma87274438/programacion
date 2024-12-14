import java.util.Scanner; 

public class switch {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Que mes quieres comprobar?");
        int mes = lector.nextInt();
        switch (mes){
            case 2:
                System.out.println(x="Febrero puede tener 28 o 29 días.");
                break;
            
            case 4,6,9,11:
                System.out.println(x="Este mes tiene 30 días");
                break;

            case 1,3,5,7,8,10,12:
                System.out.println(x="este mes tiene 31 días");
                break;
            
            default:
                System.out.prinyln(x="Mes inexistente");
        }
    }
}