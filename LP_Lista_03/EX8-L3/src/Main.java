import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double score, result;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um algarismo inteiro: ");
        score = input.nextDouble();

        result = score%2;

        if (result==0) {
            System.out.println("Par");
        }else {
            System.out.println("Ímpar");
        }


    }
}