package outrosrecursos.exercicios;

import java.util.Scanner;

public class autenticação {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean autenticacao;
        do {

        System.out.println("Digite o úsuário: ");
        String user = scanner.nextLine();
        System.out.println("Digite a senha: ");
        String pass = scanner.nextLine();

            if (user.equals("admin") && pass.equals("1234")) {
                System.out.println("Você logou com sucesso. ");
                autenticacao = true;
            } else {
                System.out.println("Autenticação falhou, tente novamente. ");
                autenticacao = false;
            }

        }while (autenticacao == false);

        scanner.close();
    }
}
