import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double deg;
        double res;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor em °C para converter em Fahrenheit");
        deg = input.nextDouble();

        res = (deg * 1.8) + 32;
        System.out.println(+ deg + "°C é " + res + " Fahrenheit");

    }
}