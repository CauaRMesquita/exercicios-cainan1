import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a, b, c;


        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de a:  ");
        a = input.nextDouble();

        System.out.println("Digite o valor de b: ");
        b = input.nextDouble();

        System.out.println("Digite o valor de c: ");
        c = input.nextDouble();

        if (a>(b+c) && a<(b-c)){
            System.out.println("Não é um triângulo");
        } else if (a==b && a==c){
            System.out.println("Triângulo Equilátero");
        } else if (a==b || a==c || b==c) {
            System.out.println("Triângulo Isósceles");
        } else {
            System.out.println("Triângulo Escaleno");
        }


    }
}