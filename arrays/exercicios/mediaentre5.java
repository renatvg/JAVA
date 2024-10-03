package arrays.exercicios;

import java.util.Scanner;

public class mediaentre5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Digite 5 números: ");
        numeros[0] = scanner.nextInt();
        numeros[1] = scanner.nextInt();
        numeros[2] = scanner.nextInt();
        numeros[3] = scanner.nextInt();
        numeros[4] = scanner.nextInt();

        float media =  (numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4]) /5 ;
        System.out.println("A média entre os números é: " + media);
        scanner.close();
    }
}
