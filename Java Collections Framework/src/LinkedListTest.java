import java.util.*;

/**
 * @author September
 * Тестируем связный список
 *
 */
public class LinkedListTest {
    public static void main(String[] args) {
        //интерфейс List
        List <String> a = new LinkedList<>();
        a.add("Hamilton");
        a.add("Ricardo");
        a.add("Alonso");

        List <String> b = new LinkedList<>();
        b.add("Bmw");
        b.add("Audi");
        b.add("Mersedes");
        b.add("Honda");

        //Объединение слов
        ListIterator <String> aIter = a.listIterator();
        ListIterator <String> bIter = b.listIterator();

        while (bIter.hasNext())
        {
            if (aIter.hasNext()) aIter.hasNext();
            aIter.add(bIter.next());
        }
        System.out.println(a);

        //удаляем все элементы массива b  из а
        a.removeAll(b);
        System.out.println(a);
    }
}
