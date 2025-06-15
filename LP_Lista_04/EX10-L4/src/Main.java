import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o número de algarismos da sequência de Fibonacci: ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Sequência de Fibonacci:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}
