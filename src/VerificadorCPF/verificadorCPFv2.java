package sidequests;
import java.util.Scanner;

public class verificadorCPFv2 {
    static void main() {

        // partes pesquisadas: grande parte da parte complicada, principalmente os calculos dentro do for
        // nao tinha entendido direito de primeira, a parte de separar os digitos foi bem facil ate
        // no final tava dando erro na linha 65 nao entendi o erro no terminal e pedi ajuda pro chat

        String CPF;
        Scanner sc = new Scanner(System.in);

        // depois eu uso isso
        // Variaveis pra fazer o calculo
        int calculoCPF1=0, restoCPF1, calculoCPF2=0,restoCPF2; // Variaveis pra fazer o calculo
        int primeiroDigito=0,segundoDigito=0,calcUlt;// Variavel pra verificar depois
        double calcUlt2;

        // Pedindo o CPF
        IO.println("Digite seu CPF(tudo junto)");
        CPF = sc.next();

        // parte complicada

        // char[]  é como se fosse varias caixas de char que vai de 0 adiante
        // toCharArray é um modulo de String que separa ela em varias caixinhas
        char[] separarDigitos = CPF.toCharArray();
        double [] digitos = new double[CPF.length()];

        // for(initialization;condition;increment/decrement){}
        // puta que pariu
        // iniciou o i=0, a condicao é ele ser menor q os digitos do CPF e quando terminar o loop ele soma 1 no i
        for (int i=0; i<9; i++){
            // não sei como explicar, mas de certa forma entendo
            digitos[i] = separarDigitos[i]-'0';
            // o valor é digito na posição i menos 10-i que no final da 2 e 3 respetivamente
            calculoCPF1 += (digitos[i]*(10-i));
            calculoCPF2 += (digitos[i]*(11-i));
        }
        // finalmente acabei essa parte complicada


        // sabour o outro codigo
        restoCPF1 = calculoCPF1%11;

        if (restoCPF1<2){
            primeiroDigito =0;
        }else if (restoCPF1>=2){
            primeiroDigito = 11-restoCPF1;
        }

        restoCPF2 = (calculoCPF2+(primeiroDigito*2))%11;
        if (restoCPF2<2){
            segundoDigito =0;
        }else if (restoCPF2>=2){
            segundoDigito = 11-restoCPF2;
        }

        // pegar os dois digitos porq n puxou la em cima (nao tava entendo o erro pedi pro chat ajudar)
        int digitoReal1 = separarDigitos[9] - '0';
        int digitoReal2 = separarDigitos[10] - '0';

        calcUlt = primeiroDigito*10+segundoDigito;
        calcUlt2 = digitoReal1*10+digitoReal2;

        // cabo finalmente
        IO.println();
        if (calcUlt2==calcUlt){
            IO.println("Seu CPF é valido");
        }else {
            IO.println("CPF Invalido");
        }

    }
}
