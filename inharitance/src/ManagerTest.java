import com.september.*;

/**
 * @author September its ME
 * Инкапсуляция
 * Полиморфизм
 * Наследование
 * Всё в одном коде.
 */

public class ManagerTest {
    public static void main(String[] args) {
        Manger boss = new Manger("Rose", 1000000); //Босс из класса Менеджер Который наследуется от Эмплой

        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Elliot", 12000);
        staff[1] = new Employee("Tyrell", 100000);
        staff[2] = boss;

        boss.setBonus(200000); //боссу можем накинуть валюты ручками


        for (Employee e : staff) {
            e.giveRaise(5);
            System.out.println("Имя " + e.getName() + "\n" + "Зарпалата " + e.getSalary());
        }

        System.out.println("");
        System.out.println(staff[0].getSalary()); //поле изменяется, так как методы внутри класса имеют доступ
    }

}
