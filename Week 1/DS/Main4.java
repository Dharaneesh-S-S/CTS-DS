class Employee {

    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int employeeId, String name,
             String position, double salary) {

        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String toString() {

        return employeeId + " " +
                name + " " +
                position + " " +
                salary;
    }
}

public class Main {

    static Employee[] employees = new Employee[10];
    static int count = 0;

    static void addEmployee(Employee e) {

        if (count < employees.length)
            employees[count++] = e;
    }

    static void searchEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == id) {

                System.out.println(employees[i]);
                return;
            }
        }

        System.out.println("Employee Not Found");
    }

    static void traverse() {

        for (int i = 0; i < count; i++)
            System.out.println(employees[i]);
    }

    static void deleteEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == id) {

                for (int j = i; j < count - 1; j++)
                    employees[j] = employees[j + 1];

                count--;

                System.out.println("Deleted");
                return;
            }
        }

        System.out.println("Employee Not Found");
    }

    public static void main(String[] args) {

        addEmployee(new Employee(101, "Arun", "Manager", 50000));
        addEmployee(new Employee(102, "Raj", "Developer", 40000));

        traverse();

        searchEmployee(102);

        deleteEmployee(101);

        System.out.println("\nAfter Deletion");
        traverse();
    }
}