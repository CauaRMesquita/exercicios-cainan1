public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35},
                {41, 42, 43, 44, 45},
                {51, 52, 53, 54, 55}
        };

        System.out.println("Diagonal secundária da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            int j = 4 - i;
            System.out.println("matriz[" + i + "][" + j + "] = " + matriz[i][j]);
        }
    }
}
