import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        double a, b, c, ordem;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de a:  ");
        a = input.nextDouble();
        System.out.println("Digite o valor de b:  ");
        b = input.nextDouble();
        System.out.println("Digite o valor de c:  ");
        c = input.nextDouble();

        double[] array = {a, b, c};
        Arrays.sort();

        for (double values : array) {
            System.out.print();
    }
}}