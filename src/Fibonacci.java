import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fibo = 0, n1 = 0, n2 = 1, opcao = -1;

        while (opcao != 0) {

            System.out.println("Digite um número para saber se está na sequência Fibonacci");
            int numeroEscolhido = sc.nextInt();
            sc.nextLine();

            while (numeroEscolhido > fibo) {
                fibo = n1 + n2;
                n1 = n2;
                n2 = fibo;
            }

            if (numeroEscolhido == fibo || numeroEscolhido == 0) {
                System.out.println("O numero: " + numeroEscolhido + " pertence a sequência Fibonacci \n");
            } else {
                System.out.println("O numero: " + numeroEscolhido + " não pertence a sequência Fibonacci\n");
            }
            System.out.println("""
                    Você deseja pesquisar algum outro numero ?
                                        
                    1 - SIM
                    0 - NÃO
                    """);

            opcao = sc.nextInt();
            sc.nextLine();
            
        }
        sc.close();
    }
}