import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double coefA, coefB, coefC;
        double raizDelta, x1, x2;

        System.out.print("Informe o valor de A: ");
        coefA = in.nextDouble();

        System.out.print("Informe o valor de B: ");
        coefB = in.nextDouble();

        System.out.print("Informe o valor de C: ");
        coefC = in.nextDouble();

        double delta = Math.pow(coefB, 2) - 4 * coefA * coefC;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else {
            raizDelta = Math.sqrt(delta);
            x1 = (-coefB + raizDelta) / (2 * coefA);
            x2 = (-coefB - raizDelta) / (2 * coefA);

            System.out.println("Valor de delta: " + delta);
            System.out.println("Raiz 1: " + x1);
            System.out.println("Raiz 2: " + x2);
        }
    }
}
