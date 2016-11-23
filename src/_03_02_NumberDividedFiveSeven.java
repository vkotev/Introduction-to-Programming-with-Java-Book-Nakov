/**
 * Created by vkotev on 23.11.2016 г..
 * Напишете булев израз, който да проверява дали дадено цяло число се дели на 5 и на 7 без остатък.
 */
public class _03_02_NumberDividedFiveSeven {
    public static void main(String[] args) {
        int num = 35;
        if ((num % 5 == 0) && (num % 7) == 0) {
            System.out.print("Number " + num + " is divided by 5 and 7");
        } else System.out.print("Number " + num + " is not divided by 5 and 7");
    }
}
