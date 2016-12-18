import java.util.Scanner;

/**
 * Created by vkotev on 12/18/2016.
 * Напишете програма, която чете от конзолата две цели числа (integer) и отпечатва
 * колко числа има между тях, такива, че остатъкът им от деленето на 5 да е 0.
 */
public class _04_04_ConsoleInputDividableNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        if ((number1 % 5 == 0 && number2 % 5 != 0) || (number1 % 5 != 0 && number2 % 5 == 0)) {
            System.out.print("Count of numbers between " + number1 + " and " + number2 + " dividable by 5: " + ((number2 - number1) / 5));
        } else
            System.out.print((number1 % 5 == 0 && number2 % 5 == 0) ? "Count of numbers between " + number1 + " and " + number2 + " dividable by 5: " + ((number2 - number1) / 5 - 1) : "Count of numbers between " + number1 + " and " + number2 + " dividable by 5: " + ((number2 - number1) / 5 + 1));
    }
}
