import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vkotev on 23.11.2016 г..
 * Силата на гравитационното поле на луната е приблизително 17% от това на земята. Напишете програма, която да изчислява тежестта на човек на луната, по дадената тежест на земята.
 */
public class _03_07_WeightOnMoon {
    public static void main(String[] args) throws IOException {
        BufferedReader earth_weight = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter weight on the Earth: ");
        String earth_weight_read = earth_weight.readLine();
        System.out.print("Weight on the Moon for a person with " + earth_weight_read + "kg weight on the Earth is " + 0.83 * Integer.parseInt(earth_weight_read)+"kg");
    }
}
