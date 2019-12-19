import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        /*Массив который расщиряется в Рантайме при помощи Reclection*/
        int[] nums = {1,2,3,57,12,5};
        nums = (int[]) ArrayReflect.goodArrayGrow(nums);


        //Так, как в массиве примитивы упаковываются
        for (int num : nums) {
            System.out.println("Значение " + num);

        }

        Object[] obj = {1, "sdq", 'f'};
        for(Object o : obj){
            System.out.println(o.getClass().getName());
        }


    }
}
