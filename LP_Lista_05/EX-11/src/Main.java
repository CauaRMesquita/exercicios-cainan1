import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o número de linhas da primeira matriz: ");
        int linhasA = in.nextInt();

        System.out.print("Informe o número de colunas da primeira matriz: ");
        int colunasA = in.nextInt();

        System.out.print("Informe o número de linhas da segunda matriz: ");
        int linhasB = in.nextInt();

        System.out.print("Informe o número de colunas da segunda matriz: ");
        int colunasB = in.nextInt();

        if (colunasA != linhasB) {
            System.out.println("Erro: não é possível multiplicar as matrizes.");
            System.out.println("O número de colunas da primeira matriz deve ser igual ao número de linhas da segunda matriz.");
            return;
        }

        int[][] A = new int[linhasA][colunasA];
        int[][] B = new int[linhasB][colunasB];
        int[][] produto = new int[linhasA][colunasB];

        System.out.println("\nDigite os valores da primeira matriz:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = in.nextInt();
            }
        }

        System.out.println("\nDigite os valores da segunda matriz:");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                produto[i][j] = 0;
                for (int k = 0; k < colunasA; k++) {
                    produto[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("\nMatriz Produto:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print(produto[i][j] + "\t");
            }
            System.out.println();
        }
    }
} // precisei de ajude de IA em grande parte do código
