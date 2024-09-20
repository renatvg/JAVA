package Loop.exercicios;

public class fizzbuzz {
    public static void main(String[] args) {
        int i = 0;
        while (i<=50) {
            i++;
            if (i % 3 == 0 && i % 2 == 0){
                System.out.println("fizzbuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("fizz");
            }
            else if (i % 2 == 0){
                System.out.println("buzz");
            }
            else {
                System.out.println(i);
            }

        }
    }
}
