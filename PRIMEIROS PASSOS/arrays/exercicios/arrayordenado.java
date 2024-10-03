package arrays.exercicios;

import java.util.Scanner;

public class arrayordenado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[5];
        boolean ordem = true;

        System.out.println("Digite 5 números numa ordem crescente: ");
        numeros[0] = teclado.nextInt();
        numeros[1]  = teclado.nextInt();
        numeros[2] = teclado.nextInt();
        numeros[3] = teclado.nextInt();
        numeros[4] = teclado.nextInt();

        for (int cont = 0; cont < numeros.length - 1; cont++){
            if (numeros[cont]> numeros[cont + 1] ) {
                ordem = false;
                break;
            }
        }
        if (ordem) {
            System.out.println("O array está em ordem crescente");
        }else {
            System.out.println("O array está fora da ordem crescente. ");
        }
        teclado.close();
    }
}
