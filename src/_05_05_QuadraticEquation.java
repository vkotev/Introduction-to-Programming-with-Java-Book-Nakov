import java.util.Scanner;

/**
 * Created by vkotev on 08.01.2017
 * <p>
 * Напишете програма, която при въвеждане на коефициентите (a, b и c)
 * на квадратно уравнение: ax2+bx+c, изчислява и извежда неговите реални корени.
 */
public class _05_05_QuadraticEquation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer a = ");
        int a = input.nextInt();
        System.out.print("Enter integer b = ");
        int b = input.nextInt();
        System.out.print("Enter integer c = ");
        int c = input.nextInt();
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d == 0) {
            System.out.println("Real root is " + (-b / 2 * a));
        } else if (d < 0) {
            System.out.println("There are no real roots to this equation.");
        } else {
            System.out.printf("Real roots are: %1$f and %2$f", ((-b + Math.sqrt(d)) / 2 * a), ((-b - Math.sqrt(d)) / 2 * a));
        }
    }
}