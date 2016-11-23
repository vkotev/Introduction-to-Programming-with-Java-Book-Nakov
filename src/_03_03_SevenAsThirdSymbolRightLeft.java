/**
 * Created by vkotev on 23.11.2016 г..
 * Напишете израз, който да проверява дали дадено цяло число съдържа 7 за трета цифра (отдясно на ляво).
 */
public class _03_03_SevenAsThirdSymbolRightLeft {
    public static void main(String[] args) {
        int num = 788;
        if (((num % 1000) / 100) == 7) {
            System.out.println("Number " + num + " contains 7 as a third symbol from right to left");
        } else System.out.println("Number " + num + " doesn't contain 7 as a third symbol from right to left");
    }
}
