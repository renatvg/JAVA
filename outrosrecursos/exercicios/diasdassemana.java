package outrosrecursos.exercicios;

import java.util.Scanner;

public class diasdassemana {
    public static void main(String[] args) {

        int num;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite o número correrspondente ao dia para saber a comida de cada um.");
            System.out.println("--------------------------");
            System.out.println("1 - Segunda feira");
            System.out.println("2 - Terça feira");
            System.out.println("3 - Quarta feira");
            System.out.println("4 - Quinta feira");
            System.out.println("5 - Sexta feira");
            System.out.println("6 - Sabado feira");
            System.out.println("7 - Domingo feira");
            System.out.println("0 - Para sair");
            System.out.println("--------------------------");

            num = scanner.nextInt();

            switch (num){
                case 1:
                    System.out.println("Na segunda feira teremos frango assado");
                    break;
                case 2:
                    System.out.println("Na terça feira teremos frango assado");
                    break;
                case 3:
                    System.out.println("Na quarta feira teremos frango assado");
                    break;
                case 4:
                    System.out.println("Na quinta feira teremos galinahda");
                    break;
                case 5:
                    System.out.println("Na sexta feira teremos carne assada");
                    break;
                case 6:
                    System.out.println("Na sabado teremos frango assado");
                    break;
                case 7:
                    System.out.println("Na domingo teremos frango assado");
                case 0:
                    break;
                default:
                    System.out.println("Selecione uma opção válida. ");


            }

        }while (num != 0);

        System.out.println("Obrigado pelo contato!");

        scanner.close();
    }
}
