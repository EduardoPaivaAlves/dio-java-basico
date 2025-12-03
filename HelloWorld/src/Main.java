import  java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println(" Digite um numero: ");
        var valor1 = scanner.nextInt();

        if (valor1 % 2 == 0) {
            System.out.println("O número " + valor1 + " é PAR.");
        } else {
            System.out.println("O número " + valor1 + " é ÍMPAR.");
        }




       /* var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero? ");
        var value1 = scanner.nextInt();
        System.out.println("Informe o segundo numero? ");
        var value2 = scanner.nextInt();
        var value3 = value1 + value2;
        System.out.println("A soma do valor " +value1+ " e valor " +value2+ " resulta no valor de " +value3 );

        var scanner = new Scanner(System.in);
        System.out.println("Quanto anos vc tem? ");
        var age = scanner.nextInt();
        System.out.println("Voce e emancipado? ");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age >= 18 || (isEmancipated && age >= 16);
        //System.out.printf(" O resultado e 4, voce acertou? %s" , + result == 4 );
        System.out.printf(" Voce pode dirigir? %s" , canDrive );

     */

    }
}