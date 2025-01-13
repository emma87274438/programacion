package AEA2;


public class trobarmaximin {
    public static void main(String[] args) {
    int[] array1 = {12,3,45,-3,65,-5,88,99,2,23,54,33,27,53,96,0};
    
    
    
    int lowestnum = array1[0];

    int highestnum = array1[array1.length - 1];

    System.out.println(array1.length);

        for (int i = 0; i < array1.length - 1; i= i +1){
            if (lowestnum > array1[i]) {
            lowestnum = array1[i];
            }
            if (highestnum < array1[i]){
            highestnum = array1[i];
            }
        }

        System.out.println( "El numero mas pequeño es: " + lowestnum);
        System.out.println("El numero mas grande es: " + highestnum);

    }   
}
