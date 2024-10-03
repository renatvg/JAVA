package Variaveis.exercicios;

import java.util.Scanner;

public class mediade3 {
    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int n1 = leitorTeclado.nextInt();
        System.out.println("Digite o segundo valor: ");
        int n2 = leitorTeclado.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int n3 = leitorTeclado.nextInt();

        float media =  (n1 + n2 + n3)/3;

        System.out.println("A média dos três valores foi: " + media);
        leitorTeclado.close();


    }
}
