package outrosrecursos;

import java.util.Scanner;

public class operadorternário {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int idademinima = 18;

        boolean resultado = idade >= idademinima && anoNascimento >= 2000;

        if (resultado){
            System.out.println("A sua idade é de: " + idade + " anos, e você nasceu em: " + anoNascimento);
        }else {
            System.out.println("Você não pode ser aceito");
        }

        // AGORA COM O OPERADOR TERNARIO; Tudo isso em uma linha só.

        String dMenor11 = idade>= 18 ? "Sim, é de maior" : "Não é de menor. ";
        System.out.println(dMenor11);
        scanner.close();
    }
}
