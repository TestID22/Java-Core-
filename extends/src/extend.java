import com.septemberEatMe.Manager;
import com.septemberEatMe.Person;
import javafx.css.Size;

import java.lang.String;
import java.util.Scanner;

public class extend {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char n = '\n';
        Person el = new Person("Elliot", 1200);
        Manager tyrel = new Manager("Tyrel", 10000);


        System.out.println(el.getName() + " Зарплата -" + el.getSalary() + n);
        System.out.println("Введите имя нового Хацкера(не мамкиного)");
        //Делаем объект кдасса Person хацкером
        System.out.println(el.makeHacker(in.nextLine()));
        //Переопределим метод
        System.out.println(tyrel.makeHacker() + " ");

        String name = "Darling";
        
        for (int i = 0; i < name.length(); i++ ) {
            System.out.println(name.charAt(i)); //

        }
    }
}