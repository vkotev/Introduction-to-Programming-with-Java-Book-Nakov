import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vkotev on 23.11.2016
 *
 * Напишете израз, който изчислява площта на трапец по дадени a, b и h.
 *
 */
public class _03_06_TrapeziumArea {
    public static void main(String[] args) throws IOException {
        BufferedReader a_input = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader b_input = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader height_input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter base a: ");
        String a_read = a_input.readLine();
        System.out.print("Enter base b: ");
        String b_read = b_input.readLine();
        System.out.print("Enter height: ");
        String height_read = height_input.readLine();
        System.out.println("Perimeter of rectangle with base a = " + a_read + ", base b = " + b_read + " and height = " + height_read + " is " + ((Integer.parseInt(a_read) + Integer.parseInt(b_read)) * (Integer.parseInt(height_read) / 2)));
    }
}