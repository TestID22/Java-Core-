
package javaapplication7;
/**
 * @autot Vitalii 22 september
 * Book: Java Generics and Collections by Philip Wadler
 */
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class testWithAndWithoutGenerics {

    public static void main(String[] args) {
        //Код с Использованием Дженерика
        List <Integer> nums = Arrays.asList(1,2,3);
        int s = 0;
        for(int i: nums)
        {
            s += i;
        }
        System.out.println("s в Дженерике" + s);
        
        
        //Чтоб понять Generics нужно посмотреть, как работал код до них
        //Внизу написан код Списка, который представлен вверху.
        //@param Arrays.asList создаём массив Чисел, в который помещаем
        //созданные Integer(1) и т.д.
        List numsWithoutGeneric = Arrays.asList(new Integer[]{
        new Integer(1),new Integer(2), new Integer(3)
        });
        int sWitoutGener = 0;
        /*В цикле создаёться обьект класса Итератор нашего СПИСКА
        вторым параметром 
        вызывается метод hasNext() - который перебирает последовательность 
        
        В теле цикла в переменную n помещается 
        */
        for (Iterator it = numsWithoutGeneric.iterator(); it.hasNext();)
        {
           int n = ((Integer)it.next()).intValue();
           sWitoutGener += n;
        }
        System.out.println("Проверка на правильное выполнение " + sWitoutGener);
        
        
        //Ещё вариант того же кода без Дженерика, но более простой
        
        int[] intG = new int[]{1,2,3};
        int sG = 0;
        for (int i = 0; i < intG.length; i++)
        {
            sG += intG[i];
        }
        System.out.println("Ещё один вариант кода, без Дженерика \nsG - чекед " + sG);
    }
    
}
