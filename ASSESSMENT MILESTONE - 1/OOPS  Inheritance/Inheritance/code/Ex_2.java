public class Ex_2 {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 50000.0, 2020, "NI123456A");
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());

        // Test setters
        emp.setName("Jane Smith");
        emp.setAnnualSalary(60000.0);
        emp.setYearStarted(2022);
        emp.setNationalInsuranceNumber("NI654321B");

        System.out.println("\nAfter updates:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());
    }
}
