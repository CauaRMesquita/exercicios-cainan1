import javax.crypto.spec.PSource;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double r;
        double height;
        double res;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o raio do cilindro");
        r = input.nextDouble();
        System.out.println("Digite a altura do cilindro");
        height = input.nextDouble();

        res = 3.14 * (r * r) * height;
        System.out.println("O cilindro tem volume de " + res);

    }
}