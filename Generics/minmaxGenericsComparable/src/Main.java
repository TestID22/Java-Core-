import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        String [] a = {"I", "Have", "Job", "and", "this", "is", "my", "Dream"};
        Pair <String> mm =  ArrayMinMax.minmax(a);

        Integer[] integers = {55,2,32,5,1,7};

        System.out.println("min " + mm.getFirst());
        System.out.println("max " + mm.getSecond());
        for (String s : a) {

            System.out.print(s + " ");
        }

        System.out.println();

        Pair<Integer> integerM = ArrayMinMax.minmax(integers);
        System.out.println(integerM.getFirst());
        System.out.println(integerM.getSecond());


    }
}

/**
 * @param []a массив Обобщённых типов (или сырых "row")
 * Обобщённый тип <T> может быть, только тип имплементящий интерфейс Comparable
 *
 */
class ArrayMinMax {

    public static <T extends Comparable> Pair<T> minmax (T []a){
        if (a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<T>(min,max);
    }
}

class Pair <T>{
    //добавим 2 переменные Обобщённого типа (2 поля)
    private T first;
    private T second;

    //добавил конструктор. Если без параметров создаётся, то полям присваиваем null
    Pair(){
        first = null;
        second = null;
    }
    //перегрузил конструктор. Если в параметрах, два объекта <T> то, полям присваиваем данные
    //из параметров
    Pair(T first, T second){
        this.first = first;
        this.second = second;
    }
    //Getters and Setters
    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

}