public class Main {
    public static void main(String[] args) {
        int[] vetor = {5, 8, 3, 7, 6, 2, 9, 1, 4, 0};

        System.out.println("Vetor original:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }

        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                vetor[i] += 2;
            } else {
                vetor[i] *= 2;
            }
        }

        System.out.println("\nVetor modificado:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
    }
}
