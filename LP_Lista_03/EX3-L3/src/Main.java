import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double score1, score2, mean;


        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        score1 = input.nextDouble();

        System.out.println("Digite a segunda nota: ");
        score2 = input.nextDouble();

        mean = (score1+score2)/2;
        System.out.println("Média = " + mean);

        System.out.println(mean<50?"Reprovado":"Aprovado");

    }
}