import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double s1;
        double s2;
        double mean;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota de 0 a 10");
        s1 = input.nextDouble();
        System.out.println("Digite a outra nota de 0 a 10");
        s2 = input.nextDouble();

        mean = (s1 + s2) / 2;
        System.out.println("A média das notas é " + mean);

    }
}