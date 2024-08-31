package Variaveis;

public class CalculadoradeIdade {
    public static void main(String[] args) {
        // passo 1 - o ano atual
        // passo 2 - o ano de nascimento
        // passo 3 - subtração ano atual - ano nascimento

        int anoAtual = 2024;
        int anoNnasc = 2006;

        int idade = anoAtual - anoNnasc;

        System.out.println("Você neste ano, completará, ou já completou "+ idade);
    }
}
