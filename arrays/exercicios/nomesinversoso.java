package arrays.exercicios;

public class nomesinversoso{
    public static void main(String[] args) {
        String[] nomes = {"Joao", "Pedro", "Renato"};

        for ( int index = nomes.length - 1 ; index>= 0; index-- ) {
            System.out.println(nomes[index]);
        }
    }
}
