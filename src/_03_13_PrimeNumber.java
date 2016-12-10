import java.util.Scanner;

/**
 * Created by vkotev on 12/10/2016.
 * Напишете програма, която проверява дали дадено число n (n < 100) е просто.
 */
public class _03_13_PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number less then 100: ");
        int number = input.nextInt();
        int count = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.print("Number " + number + " is prime");
        } else System.out.print("Number " + number + " is not prime");
    }
}
