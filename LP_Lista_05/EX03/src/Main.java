import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int[] vetor = {12, 5, 8, 19, 23, 7, 3, 10, 15, 6};

        System.out.print("Digite um número para buscar no vetor: ");
        int valor = in.nextInt();

        int posfound = -1;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                posfound = i;
                break;
            }
        }

        if (posfound != -1) {
            System.out.println("Valor encontrado na posição: " + posfound);
        } else {
            System.out.println("Valor não encontrado");
        }

        in.close();
    }
}
