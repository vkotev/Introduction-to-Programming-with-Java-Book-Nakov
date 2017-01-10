/**
 * Created by vkotev on 23.11.2016
 *
 * Напишете израз, който да проверява дали дадено цяло число е четно или нечетно.
 *
 */
public class _03_01_EvenOddNumber {
    public static void main(String[] args) {
        int num = 4;
        if (num % 2 == 0) {
            System.out.print("Number " + num + " is even");

        } else System.out.print("Number " + num + " is odd");
    }
}
