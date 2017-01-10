import java.util.Scanner;

/**
 * Created by vkotev on 18.12.2016
 *
 * Напишете програма, която чете пет числа и отпечатва най-голямото от тях.
 * Забележка: трябва да използвате конструкция "if", която до момента не сме разгледали.
 *
 */
public class _04_07_ConsoleInput5NumbersBiggest {
    public static void main(String[] args) {
        int temp = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Enter number%1$d: ", i);
            int number = input.nextInt();
            if (temp < number) temp = number;
        }
        System.out.printf("Biggest number is %d", temp);
    }
}