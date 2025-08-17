class Ex_2 {
    // Static method for integer power
    public static int powerInt(int num1, int num2) {
        return (int)Math.pow(num1, num2);
    }

    // Static method for double power
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        // For powerInt
        System.out.print("Enter first integer (num1) for powerInt: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer (num2) for powerInt: ");
        int num2 = scanner.nextInt();
        int intResult = Ex_2.powerInt(num1, num2);
        System.out.println(num1 + "^" + num2 + " = " + intResult);

        // For powerDouble
        System.out.print("Enter a double (num1) for powerDouble: ");
        double dnum1 = scanner.nextDouble();
        System.out.print("Enter an integer (num2) for powerDouble: ");
        int dnum2 = scanner.nextInt();
        double doubleResult = Ex_2.powerDouble(dnum1, dnum2);
        System.out.println(dnum1 + "^" + dnum2 + " = " + doubleResult);
        scanner.close();
    }
}