public class Ex_1 {
    private double width;
    private double height;
    private double depth;

    // Parameterized constructor
    public Ex_1(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate volume
    public double getVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        System.out.print("Enter depth: ");
        double depth = scanner.nextDouble();
        Ex_1 box = new Ex_1(width, height, depth);
        System.out.println("Volume of the box: " + box.getVolume());
        scanner.close();
    }
}
