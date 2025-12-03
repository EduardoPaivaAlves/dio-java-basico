import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*Escreva um código que receba o nome e o ano de nascimento de
        alguém e imprima na tela a seguinte mensagem:
         "Olá 'Fulano' você tem 'X' anos

        */
        String nome;
        int anoNascimento;

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.printf("Ola, Seja bem vindo!\nQual seu nome? ");
        nome = entradaUsuario.next();

        System.out.println(" Qual ano voce nasceu ? ");
        anoNascimento = entradaUsuario.nextInt();

        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - anoNascimento;

        System.out.println(" Ola " + nome + " voce tem: " + idade );



    }
}