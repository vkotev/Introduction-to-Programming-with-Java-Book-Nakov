import java.util.Scanner;

/**
 * Created by vkotev on 08.01.2017
 *
 * Напишете програма, която проверява дали дадена точка О (x, y) е вътре в окръжността К ((0,0), 5).
 *
 */
public class _03_08_PointInCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = input.nextInt();
        System.out.print("Enter y: ");
        int y = input.nextInt();
        input.close();
        if ((x >= -5) && (x <= 5) && (y >= -5) && (y <= 5)) {
            System.out.println("O (" + x + "," + y + ") is in K((0,0), 5)");
        } else
            System.out.println("O (" + x + "," + y + ") is not in K((0,0), 5)");
    }
}
