import java.util.ArrayList;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class Department {
    String name;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String name) {
        this.name = name;
    }

    void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    void displayEmployees() {
        for (Employee e : employees) {
            System.out.println(" - " + e.name);
        }
    }
}

class Company {
    String name;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String name) {
        this.name = name;
    }

    void addDepartment(Department department) {
        departments.add(department);
    }

    void displayStructure() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            System.out.println("Department: " + dept.name);
            dept.displayEmployees();
        }
    }
}

public class CompanyCompositionDemo {
    public static void main(String[] args) {
        Company company = new Company("Tech Solutions Inc.");

        Department development = new Department("Development");
        development.addEmployee("Alice");
        development.addEmployee("Bob");

        Department hr = new Department("Human Resources");
        hr.addEmployee("Carol");

        company.addDepartment(development);
        company.addDepartment(hr);

        company.displayStructure();
    }
}
