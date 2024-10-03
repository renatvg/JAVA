package outrosrecursos;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;
        float totalpedido = 0;

        do {

        System.out.println("--------------------------");
        System.out.println("Digite 1 para abobrinha");
        System.out.println("Digite 2 para maça");
        System.out.println("Digite 3 para pera");
        System.out.println("Digite 4 para goiaba");
        System.out.println("Digite 5 para morango");
        System.out.println("Digite 6 para tomate");
        System.out.println("Digite 0 para sair");
        System.out.println("--------------------------");

        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu abobrinha");
                totalpedido += 1;
                break;
            case 2:
                System.out.println("Você escolheu maça");
                totalpedido += 2;
                break;
            case 3:
                System.out.println("Você escolheu pera");
                totalpedido += 3;
                break;
            case 4:
                System.out.println("Você escolheu goiaba");
                totalpedido += 4;
                break;
            case 5:
                System.out.println("Você escolheu morango");
                totalpedido += 5;
                break;
            case 6:
                System.out.println("Você escolheu tomate");
                totalpedido += 6;
                break;
            case 0:
                System.out.println("Finalizado!");
                break;
            default:
                System.out.println("escolha uma opção válida");
        }} while (opcao != 0);

        System.out.println("O total do seu pedido foi: R$" + totalpedido);

        scanner.close();

    }
}
