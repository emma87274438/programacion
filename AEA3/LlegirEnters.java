import java.util.Scanner;

public class LlegirEnters {
public static void main (String[] args){
    LlegirEnters programa = new LlegirEnters();
    programa.inici();
}

public void inici(){
    System.out.println("Llegiu un enter pel teclat:");
    double a= llegirEnterTeclat();
    System.out.println("L'enter ha estat" + a + ".");
    System.out.println("Llegiu un altre enter pel teclat:");
    a = llegirEnterTeclat();
    System.out.println("L'altre enter ha estat " + a + ".");
}

public double llegirEnterTeclat(){
    Scanner lector = new Scanner(System.in);
    double enterLlegit = 0;
    boolean llegit = false;
while (!llegit){
    llegit = lector.hasNextInt();
    if (llegit){
        enterLlegit = lector.nextInt();
    }
    else {
        System.out.println("Aixo no es un enter.");
        lector.next();
    }
  }
lector.nextLine();

return enterLlegit;
 }
}