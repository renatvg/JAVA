package Variaveis;

import java.util.Scanner;

public class CalculadoradeIdade {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite em que ano você nasceu: ");
        int anoNnasc = teclado.nextInt();
        System.out.println("Digite em que ano você quer saber sua idade: ");
        int anoAtual = teclado.nextInt();

        int idade = anoAtual - anoNnasc;

        if (idade < 18) {
            System.out.println("Você é menor de idade! ");
        } else if( idade < 60) {
            System.out.println("Você é adulto! ");
        }
            else {
            System.out.println("Você já é idoso!");
        }
            teclado.close();
        }
    }

