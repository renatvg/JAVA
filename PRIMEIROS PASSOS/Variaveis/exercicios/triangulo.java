package Variaveis.exercicios;

import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner leitorTeclado = new Scanner(System.in);
        System.out.println("Digite o valor da base do triângulo");
        float b = leitorTeclado.nextFloat();
        System.out.println("Digite o valor do 2° lado do triângulo");
        float n2 = leitorTeclado.nextFloat();
        System.out.println("Digite o valor do 3° lado do triângulo");
        float n3 = leitorTeclado.nextFloat();
        System.out.println("Digite a altura do triângulo");
        float h1 = leitorTeclado.nextFloat();

        float per = b + n2 + h1;
        float area = (h1 * b)/2;

        System.out.println("O perimetro do triangulo é: " + per + " e a área é: " + area);

        leitorTeclado.close();

    }
}
