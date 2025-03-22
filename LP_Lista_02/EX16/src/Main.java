import javax.crypto.spec.PSource;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double r;
        double height;
        double res;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o raio do cone");
        r = input.nextDouble();
        System.out.println("Digite a altura do cone");
        height = input.nextDouble();

        res = 3.14 * (r * r) * (height / 3);
        System.out.println("O cone tem volume de " + res);

    }
}