package Week1_Algorithms_DataStructures.HandsOn4_EmployeeManagementSystem.Code;

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        ems.addEmployee(new Employee(101, "Alice", "Manager", 75000));
        ems.addEmployee(new Employee(102, "Bob", "Developer", 55000));
        ems.addEmployee(new Employee(103, "Charlie", "Designer", 48000));

        System.out.println("All Employees:");
        ems.traverseEmployees();

        System.out.println("\nSearch for employee with ID 102:");
        Employee emp = ems.searchEmployee(102);
        if (emp != null) System.out.println(emp);
        else System.out.println("Employee not found.");

        System.out.println("\nDeleting employee with ID 102:");
        ems.deleteEmployee(102);

        System.out.println("\nAll Employees after deletion:");
        ems.traverseEmployees();
    }
}
