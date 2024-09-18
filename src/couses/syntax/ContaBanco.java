package couses.syntax;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número da conta:");
        int numeroConta = sc.nextInt();

        System.out.println("Insira o número da conta:");
        String numeroAgencia = sc.nextLine();

        System.out.println("Insira o número da conta:");
        String nomeCliente = sc.nextLine();

        System.out.println("Insira o número da conta:");
        double saldoConta = sc.nextDouble();

        System.out.println("Olá, " + nomeCliente +
                ". Obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia +
                ", conta " + numeroConta +
                ", e seu saldo de " + saldoConta +
                "já está disponível para saque.");
    }
}
