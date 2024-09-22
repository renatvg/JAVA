package outrosrecursos.exercicios;

import java.util.Scanner;

public class parouimparcomoperadorternario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        String parouimpar = numero % 2 != 0? "Este número é impar. " : "Este número é par.";

        System.out.println(parouimpar);

        scanner.close();
    }
}
