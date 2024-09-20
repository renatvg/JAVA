package Loop;

import java.util.Scanner;

public class contagemdeletras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase");

        String frase = scanner.nextLine();
        int quantidadedeLetras = 0;

        for ( int indice = 0 ; indice < frase.length() ; indice++  ) { // Método length, faz exatamente isso, conta as letras. E se inicializou o indice em zero, pois dentro da String, o zero é o Primeiro digito.
            char letra = frase.charAt(indice);
            boolean isLetra = Character.isLetter(letra);
            if (isLetra) {
                quantidadedeLetras++;
            }
        }

        System.out.println("A quantidade de letras é: " + quantidadedeLetras);
    }
}
