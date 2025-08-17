class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Ex_5 {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.out.println("Please provide name and age as arguments");
                return;
            }
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Age should be >=18 and <60");
            }
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Registration successful");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter a valid integer for age.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
