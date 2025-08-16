public class Ex_17 {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Please provide a number");
            return;
        }
        int n = Integer.parseInt(args[0]);
        int temp = n, rev = 0;
        while(temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if(n == rev)
            System.out.println(n + " is a palindrome");
        else
            System.out.println(n + " is not a palindrome");
    }
}
