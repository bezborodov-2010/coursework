import java.util.Objects;

public class Employee {
    private String name;
    private String secondName;
    private String lastName;
    private int departmentName;
    private int salary;
    private int id;

    private static int counter = 0;

    public Employee(String name, String secondName, String lastName, int departmentName, int salary) {
        this.name = name;
        this.secondName = secondName;
        this.lastName = lastName;
        this.departmentName = departmentName;
        this.salary = salary;
        this.id = counter++;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }
    public int getDepartmentName() {
        return departmentName;
    }

    public int getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }

    public void setDepartmentName(int departmentName) {
        this.departmentName = departmentName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departmentName=" + departmentName +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departmentName == employee.departmentName && salary == employee.salary && id == employee.id && Objects.equals(name, employee.name) && Objects.equals(secondName, employee.secondName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secondName, lastName, departmentName, salary, id);
    }
}
