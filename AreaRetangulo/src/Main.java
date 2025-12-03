import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Escreva um código que receba a base e a altura de um retângulo,
         calcule sua área e exiba na tela
                fórmula: área=base X altura
         */

        int valorBase;
        int valorAltura;

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Qual o valor da base: ");
        valorBase = entradaUsuario.nextInt();

        System.out.println("Qual o valor da Altura: ");
        valorAltura = entradaUsuario.nextInt();

        int areaRetangulo = valorBase * valorAltura;

        System.out.println(" A area total o retangulo e: " +areaRetangulo);


    }
}