package interfaces.school;

public abstract class BaseEmployee extends BasePerson {

    private double salary;

    BaseEmployee(String firstName, String lastName, char gender, int age, String status) {
        super(firstName, lastName, gender, age, status);
    }

    public abstract double getSalary();

    public abstract double getTaxes();
}
