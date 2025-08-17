import java.util.Scanner;

class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class Ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[2];
        int[][] marks = new int[2][3];
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("Enter name of student " + (i + 1) + ":");
                names[i] = sc.nextLine();
                System.out.println("Enter marks for 3 subjects:");
                for (int j = 0; j < 3; j++) {
                    String input = sc.nextLine();
                    int mark = Integer.parseInt(input);
                    if (mark < 0) throw new NegativeValueException("Negative values are not allowed");
                    if (mark > 100) throw new OutOfRangeException("Values out of range");
                    marks[i][j] = mark;
                }
            }
            for (int i = 0; i < 2; i++) {
                int sum = 0;
                for (int j = 0; j < 3; j++) sum += marks[i][j];
                double avg = sum / 3.0;
                System.out.println("Average marks for " + names[i] + ": " + avg);
            }
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter only integer values.");
        } catch (NegativeValueException | OutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
