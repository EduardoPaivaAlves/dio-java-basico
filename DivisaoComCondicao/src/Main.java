import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        int numInicial = entradaUsuario.nextInt();

        while (true){
            System.out.println("Informe um novo numero");
            int numNovo = entradaUsuario.nextInt();

            // Ignora numero menor que o numero inicial
            if (numNovo < numInicial){
                System.out.println("Numero ignorado pois e menor que o Inicial.");
                continue;
            }
            // Verifica se a divisão tem resto diferente de 0
            if(numNovo % numInicial != 0){
                System.out.println("A divisão teve resto diferente de 0. Encerrando...");
                break;
            }else {
                System.out.println("Número aceito! O " + numNovo + " é divisível por " + numInicial);
            }
        }

    }
}