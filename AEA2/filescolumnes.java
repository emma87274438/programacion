package AEA2;

public class filescolumnes {

    public static void main(String[] args) {

        int[][] matriu = new int [10][10];
        for(int i=0; i< matriu.length; i++){
            for(int j=0; j<matriu[i].length; j++){

                if ( i % 2==0 && j % 2==0){
                    matriu[i][j]=-1;
                }

                System.out.println("la posició " +i +" " +j +"de la matriu val:" + matriu[i][j]);
            }

           System.out.println();
        }

    }
}