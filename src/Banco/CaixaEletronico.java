package Banco;

import java.util.Scanner;

public class CaixaEletronico {
    static void main() {
        // aaaaa
        // Checar Saldo
        // Deposito
        // Sacar
        // Sair

        Scanner sc = new Scanner(System.in);
        double saldoAtual;
        int escolhas;

        saldoAtual = 0;


        MenuCaixaEletronico();
        escolhas = sc.nextInt();

        switch (escolhas){
            case 1:

                break;
        }

    }

    public static void MenuCaixaEletronico(){
        System.out.println("=== MENU ===");
        System.out.println("1 - Checar Saldo");
        System.out.println("2 - Depósito");
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
    }
}
