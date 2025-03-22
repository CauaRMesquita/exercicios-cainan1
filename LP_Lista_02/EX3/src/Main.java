import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double nb;
        double res;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        nb = input.nextDouble();

        res = nb / 5;
        System.out.println("A quinta parte do número " + nb + " é " + res);

    }
}