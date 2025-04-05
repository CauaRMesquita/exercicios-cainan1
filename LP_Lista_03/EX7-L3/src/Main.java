import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a, b, c, delta, x1, x2;


        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de a:  ");
        a = input.nextDouble();

        System.out.println("Digite o valor de b: ");
        b = input.nextDouble();

        System.out.println("Digite o valor de c: ");
        c = input.nextDouble();

        delta = (b*b)-(4*a*c);
        delta = Math.sqrt(delta);
        x1 = ((-b)+delta)/2;
        x2 = ((-b)-delta)/2;

        if (delta<0){
            System.out.println("Não é possível achar a raíz de delta negativo");
        }else {
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

    }
}