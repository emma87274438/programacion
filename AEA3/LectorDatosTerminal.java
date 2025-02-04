package AEA3;

import java.util.Scanner;

public class LectorDatosTerminal {

    

    public double leerDouble(){
        Scanner s = new Scanner(System.in);
        boolean noleido = true;
        while(noleido) {
            if (s.hasNextDouble()) {
                noleido = false;
                return s.nextDouble();
            } else {
                s.next();
            }
        }
        return 0;
    }

}
