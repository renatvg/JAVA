package Loop.exercicios;

import java.util.Scanner;

public class anobissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um ano para verificar se o mesmo é bissexto: ");
        int ano = scanner.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.println("esse ano é bissexto");
        }else {
            System.out.println("Esse ano não é bissexto. ");
        }

        scanner.close();
    }
}
