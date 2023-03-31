import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Employee employee1 = new Employee(1,"sai");
        Employee employee2 = new Employee(2,"ram");
        Employee employee3 = new Employee(3,"xyz");
        Employee employee4 = new Employee(4,"def");
        Employee employee5 = new Employee(5,"abc");
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        Collections.sort(employees, (o1,o2) -> (o1.getName().compareTo(o2.getName())));
        for (Employee employee : employees) {
            System.out.print(employee.getId()+" ");
            System.out.print(employee.getName()+" ");
            System.out.println();
        }
    }
}

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}