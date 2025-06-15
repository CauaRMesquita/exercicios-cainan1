import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numeros = new int[10];


        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número para a posição " + i + ": ");
            numeros[i] = in.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];
        int posMaior = 0;
        int posMenor = 0;


        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posMaior = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }

        System.out.println("Maior número: " + maior + " (posição " + posMaior + ")");
        System.out.println("Menor número: " + menor + " (posição " + posMenor + ")");

        in.close();
    }
}
