package Loop.exercicios;

public class primosde1a50 {
    public static void main(String[] args) {

        for (int i = 2; i<=50; i++){
            boolean ehprimo = true;
            for (int j = 2;  j < i; j++ ) {
                if (i % j == 0) {
                    ehprimo = false;
                    break;
                }
            }
            if (ehprimo) {
                System.out.println(i);
            }
        }

    }
}
