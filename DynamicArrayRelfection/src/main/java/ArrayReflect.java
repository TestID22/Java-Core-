import java.lang.reflect.Array;

public class ArrayReflect {

    static Object goodArrayGrow(Object a){
        Class cl = a.getClass();
        if(!cl.isArray()){
            return null;
        }
        Class comType = cl.getComponentType();
        int length = Array.getLength(a);
        int newLegnth = length * 11 / 10 + 10;

        Object newArray  = Array.newInstance(comType, newLegnth);
        System.arraycopy(a, 0, newArray, 0, length);
        return newArray;
    }

    static void print(Object a){
        Class cl = a.getClass();
        if(!cl.isArray()){
            return;
        }
        Class comType = cl.getComponentType();

    }
}
