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
                    QuantidadeNotasSacadas();
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

    public static void QuantidadeNotasSacadas(){
        int n100=0,n50=0,n20=0,n10=0,n5=0,n2=0,n1=0;

        while (saque>0){
            if (saque>=100){
                saque-=100;
                n100++;
            }else if (saque>=50){
                saque-=50;
                n50++;
            }else if (saque>=20){
                saque-=20;
                n20++;
            }else if (saque>=10){
                saque-=10;
                n10++;
            }else if (saque>=5){
                saque-=5;
                n5++;
            }else if (saque>=2){
                saque-=2;
                n2++;
            }else if (saque>=1){
                saque-=1;
                n1++;
            }
        }

        System.out.println("Quantidade de Notas\n"+
                "Notas de R$100: "+n100+"\n"+
                "Notas de R$50: "+n50+"\n"+
                "Notas de R$20: "+n20+"\n"+
                "Notas de R$10: "+n10+"\n"+
                "Notas de R$5: "+n5+"\n"+
                "Notas de R$2: "+n2+"\n"+
                "Moeda de R$1: "+n1);
    }
}
