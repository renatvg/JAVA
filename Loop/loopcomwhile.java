package Loop;

import java.util.Scanner;

public class loopcomwhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite até que número você quer contar: ");

        int contador = scanner.nextInt();
        int num = 1;

        while (num<=contador) {
            System.out.println(num);
            num = num + 1;
        }
        scanner.close();
    }
}
