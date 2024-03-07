
import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("Digite uma string para ser invertida: ");
            String string = sc.nextLine();
            String stringInvertida = "";

            for (int i = string.length() - 1; i >= 0; i--) {
                stringInvertida += String.valueOf(string.charAt(i));
            }

            System.out.println("A String invertida fica: ");
            System.out.println(stringInvertida + "\n");

            System.out.println("""
                    Deseja inverter outra String ?
                    1 - Sim
                    0 - Sair
                    """);

            opcao = sc.nextInt();
            sc.nextLine();

        }

        sc.close();
    }
}
