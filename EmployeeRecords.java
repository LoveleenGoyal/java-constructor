class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.department = department;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Getter of salary
    public double getSalary() {
        return  salary;
    }

    // Setter of salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary! Must be positive.");
        }
    }

    // Display the employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: Rs" + salary);
    }
}

class Manager extends Employee {
    private String teamName;
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    // Display manager details
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Team Name: " + teamName);
        System.out.println("Salary: Rs" + getSalary());
    }
}
public class EmployeeRecords {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Engineering", 60000);
        emp1.displayEmployeeDetails();

        // Modifying salary using setter
        emp1.setSalary(65000);
        System.out.println("Updated Salary: Rs" + emp1.getSalary());

        System.out.println("------------------------");

        // Creating a Manager object
        Manager mgr1 = new Manager(201, "IT", 90000, "Tech Team");
        mgr1.displayManagerDetails();
    }
}

/*
Employee ID: 101
Department: Engineering
Salary: Rs60000.0
Updated Salary: Rs65000.0
------------------------
Manager Details:
Employee ID: 201
Department: IT
Team Name: Tech Team
Salary: Rs90000.0
*/
