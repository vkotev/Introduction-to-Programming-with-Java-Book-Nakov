import java.util.Scanner;

/**
 * Created by vkotev on 18.12.2016
 *
 * Напишете програма, която чете от конзолата три числа от тип int и отпечатва тяхната сума.
 *
 */
public class _04_01_ConsoleInputSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter second number: ");
        int number2 = input.nextInt();
        System.out.println("Enter third number: ");
        int number3 = input.nextInt();
        System.out.print("Sum of " + number1 + ", " + number2 + ", " + number3 + " is " + (number1 + number2 + number3));
    }
}