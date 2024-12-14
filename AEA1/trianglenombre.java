import java.util.Scanner;

public class trianglenombre {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
    System.out.print("Introduce numero de rondas: ");
    int rondas = lector.nextInt();
    for (int i =1; i <= rondas; i++){
        System.out.println();
        for (int j= 1; j<= i; j++){
            System.out.print(j);
        }
    }
}


}