import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = in.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = in.nextInt();

        int inicio, fim;

        if (num1 < num2) {
            inicio = num1 + 1;
            fim = num2;
        } else {
            inicio = num2 + 1;
            fim = num1;
        }

        System.out.println("Numeros entre " + num1 + " e " + num2 + ":");
        for (int i = inicio; i < fim; i++) {
            if (i >= 0) {
                System.out.println(i);
            }
        }
    }
}
