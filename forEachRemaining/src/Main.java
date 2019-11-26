import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.function.Consumer;
import java.util.Scanner;

/**
 * @author V1tal11 September
 * Этот придуман мной, для проверки собственных сил
 * Цель Исользовать вложенный цикл
 * И моя любимая перевёрнутая строка
 *
 * А так же пробую метод для перебора элементов массива организации самого массива
 * И лямбду...практикую
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Перевёрнутый массив строк - Вводите данные через пробел");
        Scanner in = new Scanner(System.in);
        //ввод данных
        String nameFootbals = in.nextLine();
        String[] names = nameFootbals.split(" ");//делим по пробелу

        for (String n : names){
            char[] nChar = n.toCharArray();
            System.out.println();
            for(int i = nChar.length -1; i >= 0; i--){
                System.out.print(nChar[i]);
            }

        }

        System.out.println();
        System.out.println();
        System.out.println();
        //Использование лямбды для перебора эллементов generic Массива
        ArrayList <String> name = new ArrayList<>();
        for (String n : names)
            name.add(n);

        System.out.println("Этот перебор реализован при помощи метода forEach и лямбды");
        name.forEach(e -> System.out.println(e));



        }

    }

