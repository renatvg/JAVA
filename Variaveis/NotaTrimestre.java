package Variaveis;

import java.util.Scanner;

public class NotaTrimestre {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a sua nota no primeiro trimestre: ");
        float nota1 = teclado.nextFloat();
        System.out.println("Digite a sua nota no segundo trimestre: ");
        float nota2 = teclado.nextFloat();
        System.out.println("Digite a sua nota no terceiro trimestre: ");
        float nota3 = teclado.nextFloat();

        float nf = (nota1 + nota2 + nota3)/3;

        if( nf >= 6) {
            System.out.println("Sua nota final no ano foi de: "+ nf +" Você foi aprovado! ");
        }
        else {
            System.out.println("Sua nota final no ano foi de: " + nf + " Você foi reprovado :(") ;
        }
        teclado.close();
    }
}
