package Loop;

import java.util.Scanner;

public class menuinterativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("--------------------------");
            System.out.println("Opção 1 - Renato");
            System.out.println("Opção 2 - Joao");
            System.out.println("Opção 3 - Pedro");
            System.out.println("Opção 4 - Juliana");
            System.out.println("Opção 5 - Maria");
            System.out.println("Opção 0 - Sair");
            System.out.println("--------------------------");
            System.out.println("Digite o número da opção escolhida. ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Você escolheu por Renato. ");
            }
                if (opcao == 2) {
                    System.out.println("Você escolheu por Renato. ");
                }
                    if (opcao == 3) {
                        System.out.println("Você escolheu por Renato. ");
                    }
                        if (opcao == 4) {
                            System.out.println("Você escolheu por Renato. ");
                        }
                            if (opcao == 5) {
                                System.out.println("Você escolheu por Renato. ");
                            }
                                System.out.println("Deseja escolher outra opção? Digite 1 para sim e 0 para não: ");
                                opcao = scanner.nextInt();
        } while (opcao != 0);
        System.out.println("Avalie seu atendimento. ");
        scanner.close();
    }
}
