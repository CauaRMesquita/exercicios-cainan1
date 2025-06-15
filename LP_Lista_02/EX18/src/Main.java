import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor do coeficiente A: ");
        double a = in.nextDouble();

        System.out.print("Digite o valor do coeficiente B: ");
        double b = in.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("A equação possui infinitas soluções.");
            } else {
                System.out.println("A equação não possui solução.");
            }
        } else {
            double x = -b / a;
            System.out.println("A solução da equação é: x = " + x);
        }
    }
}
