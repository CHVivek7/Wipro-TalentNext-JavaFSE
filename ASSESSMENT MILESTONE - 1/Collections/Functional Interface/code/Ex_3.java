import java.util.*;
import java.util.function.Predicate;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        System.out.println("Enter 10 words:");
        for (int i = 0; i < 10; i++) {
            words.add(sc.next());
        }
        Predicate<String> isPalindrome = word -> {
            StringBuilder sb = new StringBuilder(word);
            return word.equals(sb.reverse().toString());
        };
        ArrayList<String> palindromes = new ArrayList<>();
        for (String word : words) {
            if (isPalindrome.test(word)) {
                palindromes.add(word);
            }
        }
        System.out.println("Palindromes: " + palindromes);
    }
}
