import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double vel;
        double res;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma velocidade em km/h para ser convertida em m/s");
        vel = input.nextDouble();

        res = vel / 3.6;
        System.out.println(+ vel + " km/h em m/s é " + res + " m/s");

    }
}