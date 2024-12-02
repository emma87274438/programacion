import java.util.Scanner; 

public class CalculArees {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("De quina figura vols calcular l'area?\n");
        System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.\n");
        String figura = s.nextLine();
        boolean exists = false;
        boolean noexisteix = false; 
        boolean noexisteix = true;

        if (figura.equals("triangle")){
            exists = true;
            noexisteix = false;
            double b = 23.0;
            double h = 8.0;
            area = (b*h)/2;
          }
        
          else if (figura.equals("quadrat")){
            exists = true;
            noexisteix = false;
            double r = 37.0;
            
            area = Math.pow(r, 2);
          }

          else if (figura.equals("rectangle")){
            exists = true;
            noexisteix = false;
            double a = 68.0;
            double b = 39.0;
            area = a*b;
          }

          else if (figura.equals("trapezi")){
            exists = true;
            noexisteix = false;
            double a = 35.0;
            double b = 16.0;
            double h = 5.0;
            area = ((a*b)*h)/2;
          }

          else if (figura.equals("rombe")){
            exists = true;
            noexisteix = false;
            double dM = 75.0;
            double dm = 30.0;
            area = (dM*dm)/2;
          }

          else if (figura.equals("paralelogram")){
            exists = true;
            noexisteix = false;
            double b = 45.0;
            double h = 13.0;
            area = b*h;
          }

          else if (figura.equals("cercle")){
            exists = true;
            noexisteix = false;
            System.out.println("Quin es el radi del cercle?");
            double r = s.nextDouble();
            Math.PI = nombre pi (3.14159....)
            area = Math.pow(r, 2)*Math.PI; area = r * r* 3.14;
          }

          else{ 
            noexisteix = true;
          }
      
          *if (!noexisteix){ 
            System.out.println("L'area del " + figura + " es " + area);
          }
          else{
            System.out.println("else para cristian");
          }*/
      
           if (noexisteix){ 
            System.out.println("No és cap figura de les que toquen");
          }
          else{ 
            System.out.println("L'area del " + figura + " es " + area);
          }
      
          if(exists) {
            System.out.println("L'area del " + figura + " es " + area);
          }
      
      
      
      

    }
}