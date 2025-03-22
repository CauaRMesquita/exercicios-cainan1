import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double dist;
        double res;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor em milhas para converter em quilômetros");
        dist = input.nextDouble();

        res = dist * 1.609;
        System.out.println(+ dist + "milhas é " + res + " quilômetros");

    }
}