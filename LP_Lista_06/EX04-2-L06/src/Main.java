import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String entrada = in.nextLine();

        entrada = entrada.toLowerCase().replaceAll(" ", "");

        if (ehPalindromo(entrada, 0, entrada.length() - 1)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

    }

    public static boolean ehPalindromo(String texto, int inicio, int fim) {
        if (inicio >= fim) {
            return true;
        }

        if (texto.charAt(inicio) != texto.charAt(fim)) {
            return false;
        }
        return ehPalindromo(texto, inicio + 1, fim - 1);
    }
}
