import java.util.*;
import java.util.function.Consumer;

public class Ex_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        System.out.println("Enter 10 words:");
        for (int i = 0; i < 10; i++) {
            words.add(sc.next());
        }
        Consumer<ArrayList<String>> reverseWords = list -> {
            for (int i = 0; i < list.size(); i++) {
                StringBuilder sb = new StringBuilder(list.get(i));
                list.set(i, sb.reverse().toString());
            }
        };
        reverseWords.accept(words);
        System.out.println("Reversed words: " + words);
    }
}
