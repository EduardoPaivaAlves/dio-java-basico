import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Escreva um código que receba o
        nome e a idade de 2 pessoas e imprima a diferença de idade entre elas!
         */

        String nome1;
        String nome2;
        int idade1;
        int idade2;
        int difIdade;

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Qual o nome do primeiro usuario? ");
        nome1 = entradaUsuario.next();
        System.out.println("Qual a idade do " + nome1 + "?");
        idade1 = entradaUsuario.nextInt();

        System.out.println("Qual o nome do segundo usuario? ");
        nome2 = entradaUsuario.next();
        System.out.println("Qual a idade do " + nome2 + "?");
        idade2 = entradaUsuario.nextInt();

        difIdade = idade1 - idade2;

        System.out.printf("A diferenca de Idade do " + nome1 + " para o " + nome2 + " e de " + difIdade + " anos");

    }
}