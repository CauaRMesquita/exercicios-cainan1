import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo:");
        num = in.nextInt();
        int soma = calculo(num);

        System.out.println("A soma de todos os numeros antecessores N é: " +soma);

    }
    public static int calculo(int num){

       int soma = 0;
        for(int i=0; i<=num; i++) {
            soma += i;
        }
        return soma;
    }
}