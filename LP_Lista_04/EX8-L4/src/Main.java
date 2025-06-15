import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num, test, test2, i;

        test2 = 0;

        System.out.println("Digite um número:");
        num = in.nextInt();

        if (num <= 1) test2 = 1;
        else {
            test = num % 2;
            if (test == 0) test2 = 1;
            else {
                test = num / 2;
                i = test;
                while (i > 3) {
                    test = num % i;
                    if (test == 0) {
                        test2 = 1;
                        System.out.println(i);
                    }
                    i--;

                }
            }
        }
        if (test2 == 1) System.out.println("Número não primo");
        if (test2 == 0) System.out.println("Número primo");

    }
}