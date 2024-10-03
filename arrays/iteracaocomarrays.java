package arrays;

public class iteracaocomarrays {
    public static void main(String[] args) {
        int[] numeros = {1,2, 3,4,5,6,7};

        for (int index = 0; index < numeros.length; index++)
        {
            System.out.println(numeros[index]);
        }

        // foreach
        for( int numeral : numeros){
            System.out.println(numeral);
        }
    }
}
