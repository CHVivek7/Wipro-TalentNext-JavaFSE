import java.util.Optional;
import java.util.Scanner;

class InvalidEmployeeException extends Exception {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}

class Employee {
    String name;
    public Employee(String name) {
        this.name = name;
    }
}

public class Ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name (or press Enter to leave it null): ");
        String empName = sc.nextLine();
        Employee emp = empName.isEmpty() ? null : new Employee(empName);
        try {
            Employee result = Optional.ofNullable(emp)
                .orElseThrow(() -> new InvalidEmployeeException("Invalid Employee!"));
            System.out.println("Employee name: " + result.name);
        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
