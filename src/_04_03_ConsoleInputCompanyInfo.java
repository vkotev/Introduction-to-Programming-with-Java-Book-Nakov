import java.util.Scanner;

/**
 * Created by vkotev on 18.12.2016
 *
 * Дадена фирма има име, адрес, телефонен номер, факс номер, уеб сайт и мениджър.
 * Мениджърът има име, фамилия и телефонен номер.
 * Напишете програма, която чете информацията за компанията и нейния мениджър и я отпечатва след това на конзолата.
 *
 */
public class _04_03_ConsoleInputCompanyInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter company name: ");
        String cName = input.nextLine();
        System.out.print("Enter company address: ");
        String cAddress = input.nextLine();
        System.out.print("Enter company telephone: ");
        String cTelephone = input.nextLine();
        System.out.print("Enter company fax: ");
        String cFax = input.nextLine();
        System.out.print("Enter company website: ");
        String cWebsite = input.nextLine();
        System.out.print("Enter company manager first name: ");
        String mFirstName = input.nextLine();
        System.out.print("Enter company manager last name: ");
        String mLastName = input.nextLine();
        System.out.print("Enter company manager telephone: ");
        String mTelephone = input.nextLine();
        System.out.printf("Company Details:\n" + "Company name: %1$s \n\tAddress: %2$s \n\tTelephone: %3$s" +
                        "\n\tFax: %4$s \n\tWeb: %5$s \n\tManager: \n\t\tName: %6$s %7$s \n\t\tTelephone: %8$s",
                cName, cAddress, cTelephone, cFax, cWebsite, mFirstName, mLastName, mTelephone);
    }
}