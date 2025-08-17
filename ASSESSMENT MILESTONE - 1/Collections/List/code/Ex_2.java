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

class EmployeeDB {
    ArrayList<Employee> list = new ArrayList<>();

    boolean addEmployee(Employee e) {
        return list.add(e);
    }

    boolean deleteEmployee(int empId) {
        Iterator<Employee> it = list.iterator();
        while (it.hasNext()) {
            Employee e = it.next();
            if (e.empId == empId) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    String showPaySlip(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                return "Pay slip for employee id "+empId+": Salary = "+e.salary;
            }
        }
        return "Employee not found";
    }
}

public class Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDB db = new EmployeeDB();
        while (true) {
            System.out.println("1. Add Employee\n2. Delete Employee\n3. Show PaySlip\n4. Show All Employees\n5. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter Gender: ");
                    String gender = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    float salary = sc.nextFloat();
                    db.addEmployee(new Employee(id, name, email, gender, salary));
                    break;
                case 2:
                    System.out.print("Enter Employee ID to delete: ");
                    int delId = sc.nextInt();
                    if (db.deleteEmployee(delId))
                        System.out.println("Deleted successfully");
                    else
                        System.out.println("Employee not found");
                    break;
                case 3:
                    System.out.print("Enter Employee ID for payslip: ");
                    int payId = sc.nextInt();
                    System.out.println(db.showPaySlip(payId));
                    break;
                case 4:
                    for (Employee e : db.list) {
                        e.GetEmployeeDetails();
                    }
                    break;
                case 5:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
