import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insira o valor da compra: R$ ");
        double valor = in.nextDouble(); // valor original da compra
        double valorFinal; // valor ajustado com desconto ou acréscimo

        System.out.println("----------------------------------");
        System.out.println("Menu:");
        System.out.println("    1. Débito");
        System.out.println("    2. Pix");
        System.out.println("    3. Crédito");
        System.out.println("----------------------------------");
        System.out.print("Escolha a forma de pagamento: ");
        int formaPagamento = in.nextInt();
        System.out.println("----------------------------------");

        switch (formaPagamento) {
            case 1:
                System.out.println("Débito Selecionado");
                valorFinal = valor * 0.95;
                System.out.println("Valor final da compra: R$ " + valorFinal);
                break;

            case 2:
                System.out.println("Pix Selecionado");
                valorFinal = valor * 0.90;
                System.out.println("Valor final da compra: R$ " + valorFinal);
                break;

            case 3:
                System.out.println("Crédito Selecionado");
                System.out.println("----------------------------------");
                System.out.print("Escolha o número de parcelas (1 a 10): ");
                int parcelas = in.nextInt();

                if (parcelas < 1 || parcelas > 10) {
                    System.out.println("Número de parcelas inválido.");
                } else {
                    if (parcelas <= 4) {
                        valorFinal = valor * 1.02;
                    } else {
                        valorFinal = valor * 1.05;
                    }
                    System.out.println("Valor final da compra: R$ " + valorFinal);
                }
                break;

            default:
                System.out.println("Forma de pagamento inválida.");
                break;
        }

        in.close();
    }
}
