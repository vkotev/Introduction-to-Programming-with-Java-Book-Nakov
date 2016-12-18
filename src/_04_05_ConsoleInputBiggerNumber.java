import java.util.Scanner;

/**
 * Created by vkotev on 12/18/2016.
 * Напишете програма, която чете от конзолата две цели числа и отпечатва по-голямото от тях.
 * Реализирайте програмата без използването на сравнение. Забележка: задачата изисква малко да помислите!
 */
public class _04_05_ConsoleInputBiggerNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        System.out.printf("Bigger number between %1$d and %2$d is %3$d", number1, number2, (Math.abs(number1 - number2) + number1 + number2) / 2);
    }
}
