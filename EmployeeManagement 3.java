import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {
    private int empId;
    private String empName;
    private String empGender;
    private int yearOfJoining;

    // Constructor
    public Employee(int empId, String empName, String empGender, int yearOfJoining) {
        this.empId = empId;
        this.empName = empName;
        this.empGender = empGender;
        this.yearOfJoining = yearOfJoining;
    }

    // Getter for yearOfJoining
    public int getYearOfJoining() {
        return yearOfJoining;
    }

    // Implement the compareTo method to sort employees by year of joining
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.yearOfJoining, other.yearOfJoining);
    }

    // Override toString to display employee details
    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empGender='" + empGender + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                '}';
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        // Create an ArrayList to store employees
        ArrayList<Employee> employees = new ArrayList<>();

        // Add employee details to the list
        employees.add(new Employee(1, "Malik", "Male", 2020));
        employees.add(new Employee(2, "Sami", "Male", 2021));
        employees.add(new Employee(3, "Saad", "Male", 2022));
        employees.add(new Employee(4, "Ayaan", "Male", 2023));

        // Sort employees by year of joining
        Collections.sort(employees);

        // Print all employees
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
