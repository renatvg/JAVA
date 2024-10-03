package Loop;

import java.util.Scanner;

public class numerospares {
    public static void main(String[] args) {
        System.out.println("Digite um número que deseja ver apena os números pares. ");
        Scanner scanner = new Scanner(System.in);

        int contador = scanner.nextInt();
        int valor = 2;

        while (valor<=contador) {
            if(valor % 2 == 0){
                System.out.println(valor);

            }
            valor++; // valor++ é igual à valor = valor + 1.
        }
        scanner.close();
    }
}
