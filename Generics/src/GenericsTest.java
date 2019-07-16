/**
 * @author Septmber
 * Юзаю Дженерике. разбираюсь в Параметризации, Обобщённом программировании
 * Обобщёнными могут быть Классы, Методы и Интерфейсы
 *
 */
public class GenericsTest {
    public static void main(String[] args) {

        SeptembersArray<String> name = new SeptembersArray<>("Septmber");
        SeptembersArray<Integer> intGenerics = new SeptembersArray<>(4);

        SeptembersArray [] arr = new SeptembersArray[2];
        arr[0] = name;
        arr[1] = intGenerics;

        for (SeptembersArray septembersArray : arr) {
            System.out.println(septembersArray.getOb().getClass());
        }

    }
}
//создадим Generic класс
class SeptembersArray <T>{
    T ob;

    SeptembersArray(T ob){
        this.ob = ob;
    }


    T getOb(){
        return ob;
    }
    void add (T element){

    }
}

