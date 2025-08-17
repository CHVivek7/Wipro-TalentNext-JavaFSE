import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int empNo;
    String name;
    int age;
    String location;

    public Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee [empNo=" + empNo + ", name=" + name + ", age=" + age + ", location=" + location + "]";
    }
}

public class Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        System.out.println("Enter details for 5 employees (empNo name age location):");
        for (int i = 0; i < 5; i++) {
            int empNo = sc.nextInt();
            String name = sc.next();
            int age = sc.nextInt();
            String location = sc.next();
            employees.add(new Employee(empNo, name, age, location));
        }
        ArrayList<Employee> puneEmployees = employees.stream()
                .filter(e -> e.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Employees in Pune:");
        puneEmployees.forEach(System.out::println);
    }
}
