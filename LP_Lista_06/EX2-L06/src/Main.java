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

        int fat = 1;
        for(int i=1; i<=plug; i++) {
            fat = fat * i;
        }
        return fat;
    }
}