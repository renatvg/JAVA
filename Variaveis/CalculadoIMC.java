package Variaveis;

public class CalculadoIMC {
    public static void main(String[] args) {
        float altura = 1.65f;
        int peso = 50;
        float imc = peso / (altura * altura);

        System.out.println("Seu imc é de: " + imc);
    }
}
