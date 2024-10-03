package Variaveis;

import java.util.Scanner;

public class CalculadoIMC {
    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);
        System.out.println("Digite a sua altura: ");
        float altura = leitorTeclado.nextFloat();
        System.out.println("Digite seu peso: ");
        int peso = leitorTeclado.nextInt();
        float imc = peso / (altura * altura);

        System.out.println("Seu imc é de: " + imc);

        leitorTeclado.close();
    }
}
