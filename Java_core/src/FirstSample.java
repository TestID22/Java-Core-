import java.util.*;

public class FirstSample{
    public static void main(String[] args){
        //lesson_ 1 Java Core
        String hi = "Hello";
        System.out.println(hi);
        int random = 1;
        for (random = 0; random < 10; random ++ )
            System.out.println(random + 1);

        // Константы
        final int NUMBER_DAYS = 7;
        System.out.println(NUMBER_DAYS + ":Количество дней в неделе");

        // Инкремент
        int num_increment = 1;
        num_increment ++;
        System.out.println("Число в переменной увеличилось на 1, такого в Питоне нет" +num_increment);

        int n = 5, m = 10;
        int a = n + ++m;
        int b = n + m++;
        System.out.println(a);
        System.out.println(b);

        // Подстроки или Срез Питона
        String hello = "Hello";
        String h = hello.substring(0, 4);
        System.out.println(h);

        // Метод equals Проверка на идентичность строк
        String stroke_e = "Hello";
        if (stroke_e.equals(hello))
            System.out.println("Строки равны");

        // проверка на наличие символов в строке
        String str = "";
        if (str.length() == 0)
            System.out.println("Строка пуста, имеет значение Null");
        if (str.equals(""))
            System.out.println("Строка рава Null");
        //Ввод данных
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println(name);
    }
}