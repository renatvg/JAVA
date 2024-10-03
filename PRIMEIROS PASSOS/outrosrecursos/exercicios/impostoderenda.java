package outrosrecursos.exercicios;

import java.util.Scanner;

public class impostoderenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean imposto;
        float valorimposto;
        float excedente = 0;

        System.out.println("Digite o valor do seu salário: ");
        float salario = scanner.nextFloat();

        if (salario>2000){
            imposto = true;
            excedente = salario - 2000;
        }
        if (imposto = true ){
            valorimposto = (float) (excedente * 0.85);
            salario = salario - excedente;
            float nsalario = valorimposto + salario;
            System.out.println("Seu salario com imposto: R$" + nsalario);
        }

        scanner.close();
    }
}
