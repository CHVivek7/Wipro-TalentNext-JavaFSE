public class Ex_2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Ex_2 <number>");
            return;
        }
        int num = Integer.parseInt(args[0]);
        System.out.println("Given Number :" + num);
        System.out.println("Binary equivalent :" + Integer.toBinaryString(num));
        System.out.println("Octal equivalent :" + Integer.toOctalString(num));
        System.out.println("Hexadecimal equivalent :" + Integer.toHexString(num));
    }
}
