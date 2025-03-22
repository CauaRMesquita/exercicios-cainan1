import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double med;
        double res;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor em mm para converter em polegada");
        med = input.nextDouble();

        res = med / 25.4;
        System.out.println(+ med + "mm em pol  é " + res + " pol");

    }
}