import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Escreva um código onde o usuário entra com sua altura e peso,
        seja feito o calculo do seu IMC(IMC = peso/(altura * altura))
        e seja exibida a mensagem de acordo com o resultado:

        Se for menor ou igual a 18,5 "Abaixo do peso";
        se for entre 18,6 e 24,9 "Peso ideal";
        Se for entre 25,0 e 29,9 "Levemente acima do peso";
        Se for entre 30,0 e 34,9 "Obesidade Grau I";
        Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
        Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
         */


        String nome;
        double altura;
        int peso;

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Qual e seu nome?");
        nome = entradaUsuario.nextLine();

        System.out.println(nome + " vamos saber seu IMC?");

        System.out.println("Qual sua altura? ");
        altura = entradaUsuario.nextDouble();
        System.out.println("Qual seu Peso? ");
        peso = entradaUsuario.nextInt();

        double IMC = peso/(altura * altura);
        //System.out.println("IMC: " + IMC);
        if (IMC <= 18.5){
            System.out.println(" Seu IMC e de:  "+ IMC + " e esta Abaixo do peso");
        }else if(IMC <= 24.9){
            System.out.println(" Seu IMC e de:  "+ IMC + " e esta Peso ideal");
        }else if(IMC <= 29.9){
            System.out.println(" Seu IMC e de:  "+ IMC + " e esta Levemente acima do peso");
        }else if(IMC <= 34.9){
            System.out.println(" Seu IMC e de:  "+ IMC + " e esta com Obesidade Grau I");
        }else if (IMC <= 39.9){
            System.out.println(" Seu IMC e de:  "+ IMC + " e esta com Obesidade Grau II (Severa)");
        }else{
            System.out.println(" Seu IMC e de:  "+ IMC + " e esta com Obesidade III (Mórbida)");
        }

    }
}