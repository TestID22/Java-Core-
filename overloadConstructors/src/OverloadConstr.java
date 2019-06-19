import java.io.ObjectInputValidation;

class OverloadContstTest{
    int a;
    int b;
    int c;
    OverloadContstTest(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    OverloadContstTest(){
        a = -1;
        b = -1;
        c = -1;
    }
    OverloadContstTest(OverloadContstTest ob){
        a = ob.a;
        b = ob.b;
        c = ob.c;
    }
    OverloadContstTest (int len){
        a = b = c = len; // very важно прям порядок присвоения

    }
    int volume(){
        return  a + b + c;
    }
}

public class OverloadConstr {
    public static void main(String[] args) {


        OverloadContstTest ob1 = new OverloadContstTest(1, 2, 5);
        OverloadContstTest ob2 = new OverloadContstTest();  //тут значения a = -1; b = -1 ; c = -1;
        OverloadContstTest ob3 = new OverloadContstTest(ob1); // тут значения как в объекте ob 1;
        OverloadContstTest ob4 = new OverloadContstTest(4);

        System.out.println("Метод волум для объекта номер один " + ob1.volume());
        System.out.println("Метод волум для объекта номер два " + ob2.volume());
        System.out.println("Метод волум для объекта номер три  " + ob3.volume());
        System.out.println("Метод волум для объекта номер четыре  " + ob4.volume());


    }
}
