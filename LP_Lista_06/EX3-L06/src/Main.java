import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numx;
        int numy;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número para ser calculada sua potência: ");
        numx = in.nextInt();

        do {
            System.out.println("Digite um número para ser a potência: ");
            numy = in.nextInt();
        } while (numy<0);

        System.out.println(numx + "^" + numy + "=" + count(numx, numy));
    }
    public static int count(int x, int y){
        if (y==0)
        return 1;
        int result = 1;
    for (int i=y; i>=1; i--) {
    result*= x;
    }
    return result;
    }
}