import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = {13, 15, 24, 30, 33, 40, 42, 52, 69, 71, 88};

        System.out.print("Digite o valor a ser buscado: ");
        int valorBuscado = in.nextInt();

        int posicao = buscaBinaria(vetor, valorBuscado, 0, vetor.length - 1);

        if (posicao != -1) {
            System.out.println("Valor encontrado na posição: " + posicao);
        } else {
            System.out.println("Valor não encontrado.");
        }

    }

    public static int buscaBinaria(int[] vetor, int valor, int inicio, int fim) {
        if (inicio > fim) {
            return -1;
        }

        int meio = (inicio + fim) / 2;

        if (vetor[meio] == valor) {
            return meio;
        } else if (vetor[meio] < valor) {
            return buscaBinaria(vetor, valor, meio + 1, fim);
        } else {
            return buscaBinaria(vetor, valor, inicio, meio - 1);
        }
    }
}
