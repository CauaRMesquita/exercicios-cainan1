import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        System.out.println("Menu:");
        System.out.println("  1. Círculo");
        System.out.println("  2. Triângulo Retângulo");
        System.out.println("  3. Retângulo");
        System.out.println("--------------------------");
        System.out.print("Escolha uma opção: ");
        opcao = input.nextInt();
        System.out.println("--------------------------");

        switch (opcao) {
            case 1:
                System.out.print("Informe o raio do círculo: ");
                double raio = input.nextDouble();
                double areaCirculo = Math.PI * raio * raio;
                double perimetroCirculo = 2 * Math.PI * raio;
                System.out.println("Área = " + areaCirculo);
                System.out.println("Perímetro = " + perimetroCirculo);
                break;

            case 2:
                System.out.print("Informe a base: ");
                double base = input.nextDouble();
                System.out.print("Informe a altura: ");
                double altura = input.nextDouble();
                double areaTriangulo = (base * altura) / 2;
                double hipotenusa = Math.sqrt(base * base + altura * altura);
                double perimetroTriangulo = base + altura + hipotenusa;
                System.out.println("Área = " + areaTriangulo);
                System.out.println("Perímetro = " + perimetroTriangulo);
                break;

            case 3:
                System.out.print("Informe a largura: ");
                double largura = input.nextDouble();
                System.out.print("Informe a altura: ");
                double alturaRet = input.nextDouble();
                double areaRetangulo = largura * alturaRet;
                double perimetroRetangulo = 2 * (largura + alturaRet);
                System.out.println("Área = " + areaRetangulo);
                System.out.println("Perímetro = " + perimetroRetangulo);
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }

        input.close();
    }
}
