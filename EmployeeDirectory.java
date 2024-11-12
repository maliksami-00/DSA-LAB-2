import java.util.HashSet;

class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee emp = (Employee) obj;
        return id == emp.id && name.equals(emp.name);
    }
}

public class EmployeeDirectory {
    private HashSet<Employee> employees = new HashSet<>();

    public boolean addEmployee(String name, int id) {
        return employees.add(new Employee(name, id));
    }

    public boolean employeeExists(String name, int id) {
        return employees.contains(new Employee(name, id));
    }

    public void displayEmployees() {
        for (Employee emp : employees) {
            System.out.println("Name: " + emp.name + ", ID: " + emp.id);
        }
    }

    public static void main(String[] args) {
        EmployeeDirectory em = new EmployeeDirectory();
        em.addEmployee("Sami", 1);
        em.addEmployee("Saad", 2);
        em.addEmployee("Ayaan", 3);
        em.addEmployee("Hassan", 4);
        em.displayEmployees();
    }
}
