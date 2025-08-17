import java.util.*;
import java.util.function.Function;

class Employee {
    private int id;
    private String name;
    private String location;
    private double salary;

    public Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }
}

public class Ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        System.out.println("Enter 5 employees (id name location salary):");
        for (int i = 0; i < 5; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            String location = sc.next();
            double salary = sc.nextDouble();
            employees.add(new Employee(id, name, location, salary));
        }
        Function<Employee, String> getLocation = Employee::getLocation;
        ArrayList<String> locations = new ArrayList<>();
        for (Employee emp : employees) {
            locations.add(getLocation.apply(emp));
        }
        System.out.println("Locations: " + locations);
    }
}
