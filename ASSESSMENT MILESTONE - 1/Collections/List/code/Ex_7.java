import java.util.*;

class Employee {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    public Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public void GetEmployeeDetails() {
        System.out.println("ID: " + empId + ", Name: " + empName + ", Email: " + email + ", Gender: " + gender + ", Salary: " + salary);
    }
}

public class Ex_7 {
    public static void main(String[] args) {
        Vector<Employee> empVector = new Vector<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i+1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Gender: ");
            String gender = sc.nextLine();
            System.out.print("Salary: ");
            float salary = sc.nextFloat();
            sc.nextLine();
            empVector.add(new Employee(id, name, email, gender, salary));
        }
        System.out.println("\nUsing Iterator:");
        Iterator<Employee> it = empVector.iterator();
        while (it.hasNext()) {
            it.next().GetEmployeeDetails();
        }
        System.out.println("\nUsing Enumeration:");
        Enumeration<Employee> en = empVector.elements();
        while (en.hasMoreElements()) {
            en.nextElement().GetEmployeeDetails();
        }
        sc.close();
    }
}
