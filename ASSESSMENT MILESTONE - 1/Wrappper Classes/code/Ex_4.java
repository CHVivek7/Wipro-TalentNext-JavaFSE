import java.util.Scanner;

class Employee implements Cloneable {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void setName(String name) { this.name = name; }
    public void setId(int id) { this.id = id; }
    public void setSalary(double salary) { this.salary = salary; }

    public String toString() {
        return "Employee{name='" + name + "', id=" + id + ", salary=" + salary + "}";
    }

    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

public class Ex_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter id: ");
        int id = sc.nextInt();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        Employee emp1 = new Employee(name, id, salary);
        Employee emp2 = emp1.clone();

        // Change original
        emp1.setName("ChangedName");
        emp1.setId(999);
        emp1.setSalary(12345.67);

        System.out.println("Original Employee: " + emp1);
        System.out.println("Cloned Employee: " + emp2);
    }
}
