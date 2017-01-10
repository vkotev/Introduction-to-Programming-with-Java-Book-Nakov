import java.util.Scanner;

/**
 * Created by votev on 08.01.2017
 *
 * Да се напише if-конструкция, която изчислява стойността на две целочислени променливи
 * и разменя техните стойности, ако стойността на първата променлива е по-голяма от втората.
 *
 */
public class _05_01_SortTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number:");
        int secondNumber = input.nextInt();
        int biggerNumber = firstNumber;
        if (secondNumber > firstNumber) {
            biggerNumber = secondNumber;
        }
        System.out.printf("The bigger number is: %d%n", biggerNumber);
    }
}
