import com.september.Employee;

public class InterFaceTest {
    public static void main(String[] args) {
        Employee boss = new Employee("sanya", 120);
        Employee boss2 = new Employee("andrew", 125);

        System.out.println("Проверка " + boss.compareTo(boss2));

    }
}
