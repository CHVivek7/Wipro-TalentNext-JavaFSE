import java.util.*;
import java.util.function.Predicate;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
}

public class Ex_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        System.out.println("Enter number of employees (5-10):");
        int n = sc.nextInt();
        System.out.println("Enter employee details (id name salary):");
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double salary = sc.nextDouble();
            employees.add(new Employee(id, name, salary));
        }
        Predicate<Employee> lowSalary = e -> e.getSalary() < 10000;
        System.out.println("Employees with salary < 10000:");
        for (Employee e : employees) {
            if (lowSalary.test(e)) {
                System.out.println(e.getName());
            }
        }
    }
}
