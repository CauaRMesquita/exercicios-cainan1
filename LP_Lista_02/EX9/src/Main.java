import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double dist;
        double res;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor em quilômetros para converter em milhas");
        dist = input.nextDouble();

        res = dist / 1.609;
        System.out.println(+ dist + "km é " + res + " milhas");

    }
}