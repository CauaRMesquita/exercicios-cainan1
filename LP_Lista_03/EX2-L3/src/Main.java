import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite dois valores inteiros separados por espaço: ");
        n1 = input.nextInt();
        n2 = input.nextInt();

        if (n1>n2) {
            System.out.println(n1 + ">" + n2);
        }else if (n1<n2) {
            System.out.println(n1 + "<" + n2);
        }else {
            System.out.println(n1 + "=" + n2);
        }

    }
}