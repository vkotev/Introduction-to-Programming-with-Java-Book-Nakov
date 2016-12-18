import java.util.Scanner;

/**
 * Created by vkotev on 12/18/2016.
 * Напишете програма, която чете пет числа и отпечатва тяхната сума.
 */
public class _04_06_ConsoleInputSum5Numbers {
    public static void main(String[] args) {
        int number = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Enter number%1$d: ", i);
            number += input.nextInt();
        }
        System.out.print("Sum of all numbers is " + number);
    }
}