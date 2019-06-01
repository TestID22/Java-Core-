import com.septemberEatMe.*;
import java.util.*;

public class test_param {
    public static void main(String[] args) {
        Hacker[] hackers = new Hacker[3];
        hackers[0] = new Hacker("Elliot", 10000);
        hackers[1] = new Hacker("Darling ", 0);
        hackers[2] = new Hacker("Tyrell", 14000);

        for (Hacker element : hackers){
            System.out.println("Имя Хакера: " + element.getName() +
                                "\n Зарплата:" + element.getSalary());
        }

        //Тест 1 методы не могут изменять видочисловые параметры
        System.out.println("Начало теста\n");
        double percent = 10.0;
        System.out.println("До теста процент равен = \n" + percent);
        tripleValue(percent);
        System.out.println("После теста процент равен = \n" + percent);

        //Teст 2 второй метод может изменять поля объектов передаваемых через параметры
        System.out.println("Начало второго теста\n");
        Hacker harry = new Hacker("harry", 10000);
        System.out.println("До тества = \n" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("После теста = \n" + harry.getSalary());

        //Test 3 Третий метод
        System.out.println("Swap Testing");
        Hacker a = new Hacker("Cisco", 50000);
        Hacker b = new Hacker("rose", 1000000);
        System.out.println("Имя Хакера  a = \n" + a.getName());
        System.out.println("Имя Хакера  b = \n" + b.getName());
        swap(a,b);
        System.out.println("name Hacker a " + a.getName());
        System.out.println("name Hacker b "  + b.getName());


    }
    public static void tripleValue(double x){
        x = 3 * x;
        System.out.println("x = " + x);
    }
    public static void tripleSalary(Hacker x){
        x.raiseSalary(200.0);
        System.out.println("В конце " + x.getSalary());

    }
    public static void swap(Hacker x , Hacker y){
        Hacker temp = x;
        x = y;
        y = temp;
        System.out.println("Имя  а = " + x.getName());
        System.out.println("Имя b = " + y.getName());


    }
}

