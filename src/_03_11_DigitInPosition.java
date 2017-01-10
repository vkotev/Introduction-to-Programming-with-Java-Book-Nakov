import java.util.Scanner;

/**
 * Created by vkotev on 08.01.2017
 *
 * Дадено е число n и позиция p.
 * Напишете поредица от операции, които да отпечатат стойността на бита на позиция p от числото n (0 или 1).
 * Пример: n=35, p=5 -> 1. Още един пример: n=35, p=6 -> 0.
 *
 */
public class _03_11_DigitInPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = input.nextInt();
        System.out.print("Enter position p: ");
        int p = input.nextInt();
        input.close();
        // Method_1: with bit operations
        int i = 1;
        int mask = i << p;
        System.out.println((n & mask) != 0 ? 1 : 0);
        // Method_2:
        /*
		 * int a = n >> p; if (a % 2 == 0) {
		 * System.out.println("Last byte of n in position p is 0"); } else
		 * System.out.println("Last byte of n in position p is 1");
		 */
    }

}