import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int j, n1, n2, n3, n4, n5, maior, menor;

        maior = 0;
        menor = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite 5 números separados por espaços: ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();
        n4 = in.nextInt();
        n5 = in.nextInt();

        for (int i=0; i<=maior; i++) {
            if (n1>i) maior=n1;
            if (n2>i) maior=n2;
            if (n3>i) maior=n3;
            if (n4>i) maior=n4;
            if (n5>i) maior=n5;
        }
        for (int i=maior; i>=menor; i--) {
            if (n1<i) menor=n1;
            if (n2<i) menor=n2;
            if (n3<i) menor=n3;
            if (n4<i) menor=n4;
            if (n5<i) menor=n5;
    }
        System.out.println("Menor: " + menor + " Maior: " + maior);
}
}