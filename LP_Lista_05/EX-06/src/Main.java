public class Main {
    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.print("Vetor original: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        int aux;
        int n = vetor.length;
        for (int i = 0; i < n / 2; i++) {
            aux = vetor[i];
            vetor[i] = vetor[n - 1 - i];
            vetor[n - 1 - i] = aux;
        }

        System.out.print("\nVetor invertido: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
