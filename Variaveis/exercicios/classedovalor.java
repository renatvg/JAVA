package Variaveis.exercicios;

import java.util.Scanner;

public class classedovalor {
    public static void main(String[] args) {
        Scanner leitorTeclado = new Scanner(System.in);
        System.out.println("Digite o seu número: ");
        int n1 = leitorTeclado.nextInt();

        if (n1 > 0) {
            System.out.println("Seu número é positivo. ");
        } else if (n1 < 0) {
            System.out.println("Seu número é negativo. ");
        } else {
            System.out.println("Seu valor é zero. ");
        }
        leitorTeclado.close();

    }
    }
