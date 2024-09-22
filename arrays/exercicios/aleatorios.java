package arrays.exercicios;

import java.util.Random;

public class aleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[5];

        for (int i = 0 ; i < numeros.length ; i++) {
            numeros[i] = random.nextInt(50);
        }
        int par = 1;
        for (int i = 0 ; i < numeros.length ; i++) {
            if (numeros[i] % 2 == 0) {
                par = numeros[i];
                break;
            }
        }
        if (par != 1) {
            System.out.println("O primeiro par do array " + numeros[0] +  " " + numeros[1] + " "+ numeros[2] + " "+ numeros[3] + " " + numeros[4] + " é o número: " + par);
        } else {
            System.out.println("Este array n teve numeros pares. ");
        }

        }
}
