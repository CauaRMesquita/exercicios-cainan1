public class Main {
    public static void main(String[] args) {
       // int [] number1 = {0,6, 5, 2, 1};

        int [][] numbers = new int[2][2]; //declaração sem inicialização

        int[][] matriz = {{5, 8, 9},{9, 6, 7},{2, 3, 4}}; //declaração com inicialização da matriz

        /*
        //percorrer com vetor, "matriz".length
        for (int i=0; i<5; i++)
            System.out.println(number1[i]);

        //percorrer com for each
        for (int pointer:number1) {
            System.out.println(pointer);

        }
        */

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}