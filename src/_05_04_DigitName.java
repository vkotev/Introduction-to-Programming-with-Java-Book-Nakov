import java.util.Scanner;

/**
 * Created by vkotev on 08.01.2017
 *
 * Напишете програма, която за дадена цифра (0-9), зададена като вход,
 * извежда името на цифрата на български език.
 *
 */
public class _05_04_DigitName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter digit (0-9): ");
        byte number = input.nextByte();
        switch (number) {
            case 0:
                System.out.print("нула");
                break;
            case 1:
                System.out.print("едно");
                break;
            case 2:
                System.out.print("две");
                break;
            case 3:
                System.out.print("три");
                break;
            case 4:
                System.out.print("четири");
                break;
            case 5:
                System.out.print("пет");
                break;
            case 6:
                System.out.print("шест");
                break;
            case 7:
                System.out.print("седем");
                break;
            case 8:
                System.out.print("осем");
                break;
            case 9:
                System.out.print("девет");
                break;
            default:
                System.out.print("Въведена е некоректна цифра.");
        }
    }
}
