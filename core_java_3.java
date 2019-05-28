import java.util.Scanner;
import static java.lang.Math.*;
//CORE JAVA символьные строки глава 3.6
public class core_java_3 {

    public static final double UAH_TO_USD = 0.031;

    public static void main(String args[]) {

        Scanner id = new Scanner(System.in);
        System.out.println(sqrt(PI));

        int i = 10;
        int j = 200;
        char n = '\n';

        System.out.println("ВВеди своё имя Джедай!");
        String name = id.nextLine();
        System.out.println("Привет " + name + " \"грязный червь\"!");

        for (i = 0; i < 1; i++) {
            System.out.println("Длинна введёной строки составила: " + name.length() + " символа");
            System.out.println("Делим 15.0 на 2 = " + (15.0 / 2)); //Указывание числа с плавающей точкой, даёт точный результат
            System.out.println("Делим с отстатком 15 % 2 = " + (15 % 2));// Деление по остатку вернёт ТОЛЬКО ОСТАТОК
            System.out.println("Делим просто 15 / 2 = " + (15 / 2)); // Деление целого числа, округляет результат
            int september = 22;
            System.out.println("В бинарном коТе число 22  выглядит так - " + Integer.toBinaryString(september));
        }

        System.out.println("Введите секретный пароль, который написан на следующей строке кода!");
        String sep = "SeptemberEatMe";
        if (id.nextLine().equals(sep)) {  //Сравнение строк при помощи метода(функции) equals.
            System.out.println("Строки Одинаковы");
        }
        System.out.println("А теперь игнорим Регистр и вводим пароль");
        if (id.nextLine().equalsIgnoreCase(sep)) {
            System.out.println("секретный пароль верен anyway, как не вводи");
            System.out.println(id.nextLine().charAt(0) + " первый символ");

        }

    }
}