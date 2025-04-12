import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int option;

        Scanner input = new Scanner(System.in);

        System.out.println("""
                ------------------------\
                
                Dia da Semana\
                
                ------------------------\
                
                1. \
                
                2. \
                
                3. \
                
                4. \
                
                5. \
                
                6. \
                
                7. \
                
                ------------------------\
                
                Escolha uma opção""");
        option = input.nextInt();

        switch (option) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção Inválida");
        }

    }
}