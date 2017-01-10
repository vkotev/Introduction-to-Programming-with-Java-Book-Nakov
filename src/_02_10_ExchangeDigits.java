/**
 * Created by vkotev on 16.11.2016
 *
 * Декларирайте две променливи от тип int. Задайте им стойности съответно 5 и 10.
 * Разменете стойностите им и ги отпечатайте.
 *
 */
public class _02_10_ExchangeDigits {
    public static void main(String[] args) {
        int a = 5, b = 10, c;
        c = a;
        a = b;
        b = c;
        System.out.println("a = " + a + ", b = " + b);
    }
}
