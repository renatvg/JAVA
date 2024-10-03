package Loop;

import java.util.Scanner;

public class loopcomdoewhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int num;

            do {
                System.out.println("Digite um número entre 1 e 10");
                num = scanner.nextInt();

            } while (num < 1 || num > 10);

        System.out.println("O numero digitado foi: " + num);
        scanner.close();
    }
}
