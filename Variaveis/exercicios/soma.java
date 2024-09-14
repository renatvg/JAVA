package Variaveis.exercicios;

import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner leitorTeclado = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int n1 = leitorTeclado.nextInt();
        System.out.println("Digite seu segundo valor: ");
        int n2 = leitorTeclado.nextInt();
        int soma = n1 + n2;

        System.out.println("A soma dos valores é: " + soma);

        leitorTeclado.close();
    }}
