package couses.trycatch;

import java.util.Scanner;

public class tryCatchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Insira um número inteiro:");
            int number = sc.nextInt();
        }
        catch (Exception e) {
            System.err.println("\nErro: o número precisa ser inteiro.\n");
            main(null);
        }
    }
}
