import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double b, c, x1, x2;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite os valores de X1 e X2 separados por espaço: ");
        x1 = input.nextDouble();
        x2 = input.nextDouble();

        b = (-x1)+(-x2);
        c = (-x1)*(-x2);

        System.out.println("x² + " + b + " + " + c);

    }
}