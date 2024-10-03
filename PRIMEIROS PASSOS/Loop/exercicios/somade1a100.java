package Loop.exercicios;

public class somade1a100 {
    public static void main(String[] args) {
        int contador = 1;
        int num = 0;

        while (contador<=100){
            num = contador + num;
            contador++;
        }
        System.out.println(num);
    }
}
