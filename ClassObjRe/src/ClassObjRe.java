class Test{
    int age = 10;
    int salary = 20;
    Test (int a, int b){
        age = a;
        salary = b;
    }
    public void adder (Test ob){ // передача по ссылке - в этом методе будут изменяться данные
        ob.age += 1;
        ob.salary += 2;
    }
}
/*
Тема очень похожа на указатели в C и ссылки.
ссылка отслеживает область в памяти, где хранятся данные.
Если изменяюися данные в ссылке, то и значения по данной области памяти изменяются тоже.

в языке си в функции прописываются указатели в том числе и в параметрах функции.
А при вызове функции указываются ссылки на переменные.
 */
public class ClassObjRe {
    public static void main(String[] args) {


        Test old = new Test(1, 21);

        old.adder(old); // первый раз прменяем +1 к age и +2 к salary
        System.out.println("После использования метода age =  " + old.age + " a salary " + old.salary);
        old.adder(old); // ещё раз добавим + 1 к age и +2 к salary
        System.out.println("Теперь age =  " + old.age);
        System.out.println("Теперь salary = " + old.salary);
    }
}
