import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double s2;
        double s1;
        double mean;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        s1 = input.nextDouble();
        System.out.println("Digite a outra nota");
        s2 = input.nextDouble();

        mean = (s1 + s2) / 2;
        System.out.println("A média das notas é " + mean);

    }
}