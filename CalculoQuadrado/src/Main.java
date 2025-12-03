import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Escreva um código que receba o tamanho do lado de um quadrado,
          calcule sua área e exiba na tela
            fórmula: área=lado X lado
        */

        int tamanhoLado;

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Para sabermos o tamanho do Quadrado, digite o tamanho de um lado: ");
        tamanhoLado = entradaUsuario.nextInt();

        int area = tamanhoLado * tamanhoLado;

        System.out.printf(" O valor do lardo do quadrado recebido e: " + tamanhoLado + "\n" +
                " Assim a area total do quadrado e: " + area);

    }
}