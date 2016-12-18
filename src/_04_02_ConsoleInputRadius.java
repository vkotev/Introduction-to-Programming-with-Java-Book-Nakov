import java.util.Scanner;

/**
 * Created by vkotev on 12/18/2016.
 * Напишете програма, която чете от конзолата радиуса "r" на кръг и отпечатва неговия периметър и обиколка.
 */
public class _04_02_ConsoleInputRadius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r = input.nextInt();
        System.out.print("Perimeter of circle with radius " + r + " is " + 2 * Math.PI * r + ". Area is " + Math.PI * Math.pow(r, 2));
    }
}
