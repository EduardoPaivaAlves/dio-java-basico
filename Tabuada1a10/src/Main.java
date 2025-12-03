import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!\n");

        /*Escreva um código onde o usuário entra com um número e
        seja gerada a tabuada de 1 até 10 desse número;
        */

        int valor;
        int resultado;

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        valor = entradaUsuario.nextInt();

        System.out.println("\nTabuada do " +valor+ ":");
        for (int i = 1; i <= 10; i++) {
            resultado = valor * i;
            System.out.println(valor + " x " + i + " = " + resultado);
        }
    }
}