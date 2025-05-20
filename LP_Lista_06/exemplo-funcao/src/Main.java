import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    String pinto;

    Scanner in = new Scanner(System.in);
        System.out.println("Informe seu nome:");
    pinto = in.next();

    gerarMenu(pinto);

    System.out.println("\nexecuta outros pintos\n");

    gerarMenu(pinto);

    }
    public static void gerarMenu(String name){
        System.out.println("Bem Vindo " + name + " meu pau na sua mão");
        System.out.println("Menu: ");
        System.out.println("Option 1");
        System.out.println("Option 2");
        System.out.println("Option 3");
    }
}