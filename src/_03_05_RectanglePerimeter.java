import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vkotev on 23.11.2016
 *
 * Напишете програма, която за подадени дължина и височина на правоъгълник, изкарват на конзолата неговият периметър и лице.
 *
 */
public class _03_05_RectanglePerimeter {
    public static void main(String[] args) throws IOException {
        BufferedReader length_input = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader height_input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter length: ");
        String length_read = length_input.readLine();
        System.out.print("Enter height: ");
        String height_read = height_input.readLine();
        System.out.println("Perimeter of rectangle with length " + length_read + " and height " + height_read + " is " + 2 * (Integer.parseInt(length_read) + Integer.parseInt(height_read)));
    }
}