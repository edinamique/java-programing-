
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class Department {
    Employee employee;

    Department(Employee employee) {
        this.employee = employee;
    }

    void showEmployee() {
        System.out.println(
            "Employee: " + employee.name
        );
    }
}

public class aggregation {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice");

        Department d1 = new Department(e1);

        d1.showEmployee();
    }
}
