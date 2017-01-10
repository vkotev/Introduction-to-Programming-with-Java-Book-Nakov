import java.util.Scanner;

/**
 * Created by vkotev on 08.01.2017
 *
 * Дадено е число n, стойност v (v = 0 или 1) и позиция p.
 * Напишете поредица от операции, които да променят стойността на n,
 * така че битът на позиция p да има стойност v.
 * Пример n=35, p=5, v=0 -> n=3. Още един пример: n=35, p=2, v=1 -> n=39.
 */
public class _03_12_ChangeBitOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = input.nextInt();
        System.out.print("Enter position p: ");
        int p = input.nextInt();
        System.out.print("Enter value v (0 or 1): ");
        int v = input.nextInt();
        input.close();
        int mask = v << p;
        int i1 = 1 << p;
        if (v == 0) {
            if (((n & mask) != 0 ? 1 : 0) == 0) {
                System.out.println("n = " + (n - i1));
            }
        } else if (v == 1) {
            if (((n | mask) != 0 ? 1 : 0) == 1) {
                System.out.println("n = " + (n + i1));
            }
        } else
            System.out.println("n = " + n);
    }
}

