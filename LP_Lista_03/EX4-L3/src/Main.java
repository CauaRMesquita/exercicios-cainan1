import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double score1, score2, mean, rec;


        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        score1 = input.nextDouble();

        System.out.println("Digite a segunda nota: ");
        score2 = input.nextDouble();

        mean = (score1+score2)/2;
        System.out.println("Média = " + mean);

        if (mean >= 50) {
            System.out.println("Aprovado");
        }else {
            System.out.println("Digite a nota da recuperação: ");
            rec = input.nextDouble();

            mean = (mean + rec)/2;
            System.out.println("Nova média = " + mean);

            if (mean<50){
                System.out.println("Reprovado");
            }else {
                System.out.println("Aprovado");
            }
        }

    }
}