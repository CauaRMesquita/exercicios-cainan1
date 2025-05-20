import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo:");
        num = in.nextInt();

        int fatorial = calculo(num);

        System.out.println("O valor de seu Fatorial é: " +fatorial);

    }
    public static int calculo(int num){

        int fat = 1;
        for(int i=1; i<=num; i++) {
            fat = fat * i;
        }
        return fat;
    }
}