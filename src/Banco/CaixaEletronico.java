package Banco;

import java.util.Scanner;

public class CaixaEletronico {

    public static Scanner sc = new Scanner(System.in);
    public static double saldoAtual, deposito, saque;
    public static int escolhas;

    static void main() {
        // aaaaa
        // Checar Saldo
        // Deposito
        // Sacar
        // Sair

        saldoAtual = 0;

        for (int i=1; i>0; i++){
            MenuCaixaEletronico(); // Literalmente o Menu do Caixa
            escolhas = sc.nextInt(); // Escolhas
            PularLinha(); // Pula Linha
            OpcoesCaixaEletronico(); // Opções
            PularLinha(); // Pula Linha dnv
        }

    }

    // Literalmente o Menu que aparece
    public static void MenuCaixaEletronico(){
        System.out.println("===== MENU =====");
        System.out.println("1 - Checar Saldo");
        System.out.println("2 - Depósito");
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void OpcoesCaixaEletronico(){
        switch (escolhas){
            case 1: // Isso é a mesma coisa que um print mano
                IO.println("Seu saldo é R$"+saldoAtual);
                break;

            case 2: // Deposito do dinheiro (não pode depositar -67 dinheiros)
                IO.println("Quanto você quer depositar?");
                deposito = sc.nextDouble();
                if (deposito<0){
                    IO.println("Deposito invalido");
                }else{
                    saldoAtual = saldoAtual+deposito;
                }
                break;

            case 3: // Saque do dinheiro
                IO.println("Quanto você quer Sacar?");
                saque = sc.nextDouble();
                if (saque > saldoAtual){
                    IO.println("Você não tem dinheiro suficiente para Sacar");
                }else{
                    saldoAtual = saldoAtual-saque;
                }
                break;

            case 4: // Isso da exit no Java
                System.exit(0);
                break;
        }
    }

    // Cara, isso literalmente pula uma linha
    public static void PularLinha(){
        IO.print("\n");
    }
}
