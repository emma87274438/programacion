package AEA2;


public class trobarmaximin {
    public static void main(String[] args) {
    int[] array = {12,3,45,-3,65,-5,88,99,2,23,54,33,27,53,96,0};

    
    int secondnum = array[0];

    int highestnum = array[0];

        for (int i = 0; i < array.length; i++){
            if (highestnum < array[i]){
            secondnum = highestnum;
            highestnum = array[i];
            }
        }

        System.out.println( "El segundo numero mas grande es: " + secondnum);

    }   
}
