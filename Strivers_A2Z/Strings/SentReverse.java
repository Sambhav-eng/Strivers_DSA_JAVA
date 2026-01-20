import java.util.*;

public class SentReverse {

    public String reversed(String s) {
        String[] words = s.split(" ");
        StringBuilder rev = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            rev.append(words[i]);
            if (i != 0) {
                rev.append(" ");
            }
        }
        return rev.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Sentence : ");
        String c = in.nextLine();

        SentReverse ob = new SentReverse();
        System.out.println(ob.reversed(c));

        in.close();
    }
}
