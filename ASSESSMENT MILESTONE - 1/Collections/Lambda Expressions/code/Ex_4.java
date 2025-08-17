interface WordCount {
    int count(String str);
}

public class Ex_4 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        WordCount wc = (str) -> {
            if (str == null || str.trim().isEmpty()) return 0;
            return str.trim().split("\\s+").length;
        };
        int result = wc.count(input);
        System.out.println("Number of words: " + result);
    }
}
