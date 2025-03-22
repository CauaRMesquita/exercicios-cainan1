import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double base;
        double height;
        double res;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a base do triângulo retângulo");
        base = input.nextDouble();
        System.out.println("Digite a altura do triângulo retângulo");
        height = input.nextDouble();

        res = (base * height) / 2;
        System.out.println("O triângulo retângulo tem área de " + res);

    }
}