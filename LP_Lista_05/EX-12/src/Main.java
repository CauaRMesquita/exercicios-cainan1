public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {2, 3, 1},
                {4, 1, 5},
                {7, 2, 6}
        };

        int determinante =
                matriz[0][0] * matriz[1][1] * matriz[2][2] +
                        matriz[0][1] * matriz[1][2] * matriz[2][0] +
                        matriz[0][2] * matriz[1][0] * matriz[2][1] -
                        matriz[0][2] * matriz[1][1] * matriz[2][0] -
                        matriz[0][0] * matriz[1][2] * matriz[2][1] -
                        matriz[0][1] * matriz[1][0] * matriz[2][2];

        System.out.println("Matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nDeterminante da matriz: " + determinante);
    }
}
