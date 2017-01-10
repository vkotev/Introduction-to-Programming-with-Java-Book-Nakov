import java.util.Scanner;

/**
 * Created by vkotev on 08.01.2017
 *
 * Напишете програма, която намира най-голямото по стойност число, измежду три дадени числа.
 *
 */
public class _05_03_BiggestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter third number: ");
        int number3 = input.nextInt();
        if (number1 > number2) {
            if (number1 > number3) {
                System.out.print("Biggest number is " + number1);
            } else if (number2 > number3) {
                System.out.print("Biggest number is " + number2);
            } else
                System.out.print("Biggest number is " + number3);
        } else if (number2 < number3) {
            System.out.print("Biggest number is " + number3);
        } else
            System.out.print("Biggest number is " + number2);
    }
}
