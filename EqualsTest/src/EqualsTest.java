import java.net.SocketOption;

public class EqualsTest {
    public static void main(String[] args) {
        Manager manger1 = new Manager("ff", 1200);
        Manager manger2 = new Manager("ff", 1200);
        Employee boss = new Employee("name ", 1000);
        Manager vitala = new Manager("vitala", 100000);

        vitala.setName("VitalaCoder Level 2");

        boss.raiseSalary(50);
        System.out.println("Подняли боссу зарплатку на 50 " + boss.getSalary());
        System.out.println("Name " + vitala.getName());
        System.out.println("Salary "  + vitala.getSalary());

        System.out.println("Класс манагер1 равене клаасу2 ?" + manger1.equals(manger2));
        System.out.println(manger1.equals(boss));
        System.out.println(vitala.getName());


    }
}
