import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double r;
        double res;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o raio do círculo para descobrir sua área");
        r = input.nextDouble();

        res = 3.14 * (r * r);
        System.out.println("O círculo tem área de " + res);

    }
}