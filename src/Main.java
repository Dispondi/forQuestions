import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String numbers = sc.nextLine();
        double result = 0;

        String[] words = numbers.split(" + ");
        for (String word : words) {
            result += Double.parseDouble(word);
            System.out.println(word);
        }

        System.out.println(result);
    }
}