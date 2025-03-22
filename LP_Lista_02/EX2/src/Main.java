import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int nb;
        int res;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        nb = input.nextInt();

        res = nb * nb;
        System.out.println("O quadrado de " + nb + " é " + res);

    }
}