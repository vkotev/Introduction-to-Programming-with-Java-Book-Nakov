import java.util.Scanner;

/**
 * Created by vkotev on 08.01.2017
 *
 * Напишете програма, която показва знака (+ или -) от частното на две реални числа, без да го пресмята.
 *
 */
public class _05_02_QuotientSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float number1 = input.nextFloat();
        System.out.print("Enter second number: ");
        float number2 = input.nextFloat();
        if ((number2 != 0) && (number1 != 0)) {
            if ((number1 > 0) && (number2 > 0)) {
                System.out.printf("Sign of division of %1$f and %2$f is \"+\"", number1, number2);
            } else if ((number1 > 0) && (number2 < 0)) {
                System.out.printf("Sign of division of %1$f and %2$f is \"-\"", number1, number2);
            } else if ((number1 < 0) && (number2 > 0)) {
                System.out.printf("Sign of division of %1$f and %2$f is \"-\"", number1, number2);
            } else if ((number1 < 0) && (number2 < 0)) {
                System.out.printf("Sign of division of %1$f and %2$f is \"+\"", number1, number2);
            }
        } else {
            System.out.print("Incorrect values entered.");
        }
    }
}