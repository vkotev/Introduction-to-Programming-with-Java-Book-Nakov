/**
 * Created by vkotev on 19.10.2016 г..
 * Декларирайте две променливи от тип String със стойности "Hello" и "World". Декларирайте променлива от тип Object.
 * Присвоете на тази променлива стойността, която се получава от конкатенацията на двете стрингови променливи (добавете интервал, ако е необходимо).
 * Отпечатайте променливата от тип Object. Декларирайте променлива от тип String и присвоете на последната променливата от тип Object.
 */
public class _02_05_Concatenation {
    public static void main(String[] args) {
        String hello = "Hello";
        String world = "World";
        Object obj = hello + " " + world;
        System.out.println(obj);
    }
}
