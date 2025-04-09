import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, result = 0;
        int option;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite dois numeros separados por espaço: ");
        n1 = input.nextDouble();
        n2 = input.nextDouble();

        System.out.println("------------------------" +
                           "\nMENU" +
                           "\n------------------------" +
                           "\n1. Soma" +
                           "\n2. Subtração" +
                           "\n3. Multiplicação" +
                           "\n4. Divisão" +
                           "\n------------------------" +
                           "\nEscolha uma opção");
        option = input.nextInt();

        switch (option) {
            case 1:
                result = n1+n2;
                break;
            case 2:
                result = n1-n2;
                break;
            case 3:
                result = n1*n2;
                break;
            case 4:
                result = n1/n2;
                break;
            default:
                System.out.println("Opção Inválida");

        }
        System.out.println("O resultado é " + result);

    }
}