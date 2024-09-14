package Variaveis.exercicios;

import java.util.Scanner;

public class quadrado {
    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);
        System.out.println("Digite o valor que você quer ao quadrado: ");
        double n1 = leitorTeclado.nextDouble();
        double quadrado = n1 * n1;
        System.out.println("O numéro " + n1 + " ao quadrado é: "+ quadrado);
        leitorTeclado.close();

    }
}
