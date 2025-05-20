import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo");
        num = in.nextInt();

        int count = somarAntecessores(num);

        System.out.println("A soma de todos os seus antecessores até ele é: " +count);
    }
    public static int somarAntecessores(int n) {
        if (n==1)
            return 1;
        return n + somarAntecessores(n-1);
    }
}