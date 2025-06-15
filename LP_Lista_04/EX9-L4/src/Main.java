import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String jogarNovamente;

        do {
            boolean perdeu = false;

            for (int base = 1; base <= 10 && !perdeu; base++) {
                for (int multiplicador = 1; multiplicador <= 10 && !perdeu; multiplicador++) {
                    int resCorreto = base * multiplicador;

                    System.out.print(base + " x " + multiplicador + " = ");
                    int resp = in.nextInt();

                    if (resp != resCorreto) {
                        System.out.println("Você errou! O resultado correto era " + resCorreto + ".");
                        perdeu = true;
                    }
                }
            }

            if (!perdeu) {
                System.out.println("Parabéns! Você completou todas as tabuadas sem erros!");
            }

            System.out.print("Deseja jogar novamente? (s/n): ");
            jogarNovamente = in.next();

        } while (jogarNovamente.equalsIgnoreCase("s"));

        System.out.println("Obrigado por jogar!");
    }
} // precisei de ajuda da IA para em boa parte do código
