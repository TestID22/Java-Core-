import java.util.GregorianCalendar;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(int percent){
        int raise = this.salary * percent / 100;
        this.salary += raise;
    }

    public boolean equals (Object otherObject) {
        if (otherObject == null)
            return false;
        if (this == otherObject)
            return true;
        if (getClass() != otherObject.getClass())
            return false;

        Employee other = (Employee) otherObject;
        return  name.equals(other.name)
                && salary == other.salary;

    }
}
