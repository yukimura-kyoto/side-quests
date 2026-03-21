import java.util.Scanner;

public class verificadorCPF {
    static void main() {

            // Partes pesquisadas: foi como o calculo do CPF era feito, alguma maneira de separar os número,
            // o jeito que usei foi o unico que eu consegui entender como funciona para poder usar
            // no final eu pensei por um tempo como é um número decimal, se eu multiplicasse o primeiro eu
            // podia somar o segundo.

            // Variveis, foi feito conforme a necessidade
            int num1,num2,num3,num4; // Variavel CPF
            int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11; // Todos os digitos
            int calculoCPF1, restoCPF1, calculoCPF2,restoCPF2; // Variaveis pra fazer o calculo
            int primeiroDigito=0,segundoDigito=0,calcUlt; // Variavel pra verificar depois
            Scanner sc = new Scanner(System.in);

            // Pedindo o CPF
            IO.println("Digite seu CPF(digite com espaços)");
            num1 = sc.nextInt();num2 = sc.nextInt();num3 = sc.nextInt();num4 = sc.nextInt(); // isso separa a cada espaço

            // Separar o CPF em digitos
            n1 = num1/100; // divide por 100 vira o primeiro digito de 3 digitos
            n2 = (num1/10)%10; // divide por 10 e pega o ultimo digito, o 3 digito some da existencia indo atrás da virgula
            n3 = num1 % 10; // pega o ultimo digito

            n4 = num2/100;
            n5 = (num2/10)%10;
            n6 = num2 % 10;

            n7 = num3/100;
            n8 = (num3/10)%10;
            n9 = num3 % 10;

            n10 = num4 / 10;
            n11 = num4 % 10;

            // aaaaah calculo complicado do Primeiro Digito
            calculoCPF1 = (n1*10)+(n2*9)+(n3*8)+(n4*7)+(n5*6)+(n6*5)+(n7*4)+(n8*3)+(n9*2);
            restoCPF1 = calculoCPF1%11;

            if (restoCPF1<2){
                primeiroDigito =0;
            }else if (restoCPF1>=2){
                primeiroDigito = 11-restoCPF1;
            }

            // aaaaaahh calculo complicado pro Segundo Digito
            calculoCPF2 = (n1*11)+(n2*10)+(n3*9)+(n4*8)+(n5*7)+(n6*6)+(n7*5)+(n8*4)+(n9*3)+(primeiroDigito*2);
            restoCPF2 = calculoCPF2%11;

            if (restoCPF2<2){
                segundoDigito =0;
            }else if (restoCPF2>=2){
                segundoDigito = 11-restoCPF2;
            }

            //Verificação do CPF yay
            calcUlt = primeiroDigito*10+segundoDigito;

            if (num4==calcUlt){
                IO.println("Seu CPF é valido");
            }else {
                IO.println("CPF Invalido");
            }


    }
}
