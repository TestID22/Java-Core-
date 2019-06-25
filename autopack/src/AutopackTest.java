import java.util.ArrayList;
import java.util.Arrays;

public class AutopackTest {
    public static void main(String[] args) {
        int [] nums = new int[2]; //массив

        ArrayList <Integer> numsArratList = new ArrayList <Integer>(10); //списочный массив

        numsArratList.add(2); //методы класса списочного массива
        numsArratList.add(54);
        int index = numsArratList.get(0);


        for(int i = 0; i < 100; i ++) {
            numsArratList.add(i); //инициализация массива.динамически расширяемый массив
            System.out.println(i);


        }
        String s =  numsArratList.toString();
        System.out.println(index);
        System.out.println(s);
    }
}
