import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double vel;
        double res;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma velocidade em m/s para ser convertida em km/h");
        vel = input.nextDouble();

        res = vel * 3.6;
        System.out.println(+ vel + " m/s em km/h é " + res + " km/h");

    }
}