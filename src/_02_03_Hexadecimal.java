/**
 * Created by vkotev on 19.10.2016
 *
 * Инициализирайте променлива от тип int със стойност 256 в шестна-десетичен формат
 * (256 е 100 в бройна система с база 16).
 *
 */
public class _02_03_Hexadecimal {

    public static void main(String[] args) {
        int a = 256;
        System.out.println("Hexadecimal of " + a + " is " + Integer.toHexString(a));
    }
}
