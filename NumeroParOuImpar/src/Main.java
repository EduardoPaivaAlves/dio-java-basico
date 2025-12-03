import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Escreva um código que o usuário entre com um primeiro número,
        um segundo número maior que o primeiro e escolhe entre a opção par e impar,
        com isso o código deve informar todos os números pares ou ímpares
        (de acordo com a seleção inicial) no intervalo de números informados,
        incluindo os números informados e em ordem decrescente;
         */

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int numero1 = entradaUsuario.nextInt();

        int numero2; //tem que ser maior que o primeiro numero
            do {
            System.out.println("Digite um segundo numero Maior que o " + numero1 + ":");
            numero2 = entradaUsuario.nextInt();

                if (numero2 <= numero1) {
                    System.out.println("O numero informado deve ser MAIOR que " + numero1 + "!! Tente novamente: ");

            }

                }while (numero2 <= numero1) ;
                    System.out.println("Perfeito! O número " + numero2 + " é maior que " + numero1 + ".");

        // --- Escolha entre par ou ímpar ---
        System.out.print("Você deseja ver os números (P)ares ou (I)mpares? ");
        char escolha = entradaUsuario.next().toUpperCase().charAt(0);

        System.out.println("\nNúmeros " + (escolha == 'P' ? "PARES" : "ÍMPARES") +
                " entre " + numero1 + " e " + numero2 + " (em ordem decrescente):");

        // --- Exibição dos números em ordem decrescente ---
        for (int i = numero2; i >= numero1; i--) {
            if (escolha == 'P' && i % 2 == 0) {
                System.out.println(i);
            } else if (escolha == 'I' && i % 2 != 0) {
                System.out.println(i);
            }
        }

        }
    }
