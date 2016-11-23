/**
 * Created by vkotev on 23.11.2016 г..
 * Напишете израз, който да проверява дали третия бит на дадено число е 1 или 0.
 */
public class _03_04_ThirdBitCheck {
    public static void main(String[] args) {
//Variant 1
        int num = 2;
        if ((num & 4) != 0) {
            System.out.println("Number " + num + " has 1 as a third bit");
        } else System.out.println("Number " + num + " has 0 as a third bit");
    }
/*Variant 2
        if ((num >> 2) % 2 == 0) {
            System.out.println("Number " + num + " has 0 as a third bit");
        } else System.out.println("Number " + num + " has 1 as a third bit");
    }*/
}