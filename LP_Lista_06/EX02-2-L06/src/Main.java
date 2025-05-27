import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Digite um número inteiro positivo:");
            num = in.nextInt();
        } while (num<=0);

        int fatorial = calculo(num);

        System.out.println("O valor de seu Fatorial é: " +fatorial);

    }
    public static int calculo(int plug){
        if (plug==1)
            return 1;
        return plug*calculo( plug-1);
    }
}