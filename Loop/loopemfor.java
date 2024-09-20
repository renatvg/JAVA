package Loop;

import java.util.Scanner;

public class loopemfor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

            for ( int contador = 1; contador<= num ; contador++) {

            System.out.println(contador);
            }

        scanner.close();
        }
    }

