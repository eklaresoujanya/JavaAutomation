package javaOOPSExceptionAssessment;

public class Employee {

    private int id;
    private String name;
    private float salary;

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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("John Doe");
        employee.setSalary(50000);

        System.out.print("Employee ID: " + employee.getId() + " Employee Name: " + employee.getName() + " Employee Salary: " + employee.getSalary());

    }
}
