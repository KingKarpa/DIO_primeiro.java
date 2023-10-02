import java.util.Scanner;

public class ContaTerminal {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Seja bem-vindo ao programa ContaTerminal\n");
        System.out.print("----------------------------------------\n");

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o valor para saque: ");
        double saldo = scanner.nextDouble();

        System.out.print("----------------------------------------\n");

        System.out.print(
            "Olá " + nome + 
            ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
            ", conta " + numero +
            " e seu saldo " + saldo +
            " já está disponível para saque"
        );

        scanner.close();
    }
}
