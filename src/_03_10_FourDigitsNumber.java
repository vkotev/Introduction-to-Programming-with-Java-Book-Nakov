import java.util.Scanner;

/**
 * Created by vkotev on 26.11.2016
 *
 * Напишете програма, която приема за вход четирицифрено число във формат abcd
 * и след това извършва следните действия върху него:
 * - Пресмята сбора от цифрите на числото.
 * - Разпечатва на конзолата цифрите в обратен ред: dcba.
 * - Поставя последната цифра, на първо място: dabc.
 * - Разменя мястото на втората и третата цифра: acbd.
 *
 */
public class _03_10_FourDigitsNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 4-digits number: ");
        int number = input.nextInt();
        int temp_a = 0;
        int temp_b = 0;
        int temp_c = 0;
        int temp_d = 0;
        int temp_number = number;
        //- Пресмята сбора от цифрите на числото.
        for (int i = 0; i <= 3; i++) {
            temp_a += temp_number % 10;
            temp_number = temp_number / 10;
        }
        System.out.println(" - Sum of all digits of " + number + " is " + temp_a);
        temp_number = number;
        //- Разпечатва на конзолата цифрите в обратен ред: dcba.
        for (int j = 3; j >= 0; j--) {
            temp_b += (temp_number % 10) * Math.pow(10, j);
            temp_number = temp_number / 10;
        }
        System.out.println(" - Reverse digits order of " + number + " is " + temp_b);
        temp_number = number;
        //- Поставя последната цифра, на първо място: dabc.
        temp_c = temp_number / 10 + (temp_number % 10) * 1000;
        System.out.println(" - Last digit in first place number of " + number + " is " + temp_c);
        //- Разменя мястото на втората и третата цифра: acbd.
        temp_d = (temp_number / 1000) * 1000 + (((temp_number / 100) % 10) * 10) + (((temp_number / 10) % 10) * 100) + (temp_number % 10);
        System.out.println(" - Changed second and third digits places number of " + number + " is " + temp_d);
    }
}
