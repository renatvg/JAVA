package Variaveis.exercicios;

import java.util.Scanner;

public class votar {
    public static void main(String[] args) {
        Scanner leitorTeclado = new Scanner(System.in);
        System.out.println("Digite o ano que você nasceu");
        int anonasc = leitorTeclado.nextInt();

        int idade = 2024 - anonasc;

        if (idade>=18) {
            System.out.println("Você é maior de idade, e pode votar");
        } else if (idade>=16) {
            System.out.println("Você é menor de idade, e já vota. ");
        }
        else {
            System.out.println("Você ainda é menor de idade e não pode votar. ");
        }
        leitorTeclado.close();
    }
}
