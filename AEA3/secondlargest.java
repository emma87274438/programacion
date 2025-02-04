package AEA3;


public class secondlargest {

    public static void main(String[] args){
    int[] array = {234, 43, 3, 88, 89, 1, 123, 905};

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