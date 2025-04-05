import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double score1;


        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        score1 = input.nextDouble();

        if (score1<=9 && score1>=5) {
            System.out.println("Entrada permitida");
        }else {
            System.out.println("Entrada negada");
        }
    }
}