import java.util.Scanner;

/**
 * Created by mdb17 on 3/22/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();
        String w = "";
        System.out.print("Your word(s) reversed is: ");
        for (int i = word.length(); i > 0; i--) {
            w = word.substring(i - 1, i);

            System.out.print(w);
        }


    }
}
