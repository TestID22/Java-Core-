import com.septemberEatMe.*;

public class TestStack {
    public static void main(String[] args ){
        Stack stk1 = new Stack();
        Stack stk2 = new Stack();
        //инициализация стека 1
        for (int i = 0; i < 10; i++)
            stk1.push(i);
        //инициализация стека номер 2
        for (int j = 10; j < 20; j++)
            stk2.push(j);
        //выведем содержимое стека1
        System.out.println("Стек один содержит");
        for(int i = 10; i >0; i--)
            System.out.println(stk1.pop());
        //выведем содиржимое стека номер 2
        System.out.println("Cтек два сожержит");
        for(int j = 20; j > 10; j --)
            System.out.println(stk2.pop());

    }



}
