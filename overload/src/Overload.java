class OverloadTest{
    void test(){
        System.out.println("Параметров нет");
    }
    void test(int a){
        System.out.println("Параметр : " + a);
    }
    void test (int a, int b){
        System.out.println("Параметр a равен - " + a);
        System.out.println("Параметр b равен - " + b);
    }
    double test(double a){
        a =  a * a;
        return  a;
    }
}


public class Overload {
    public static void main(String[] args) {
        OverloadTest ob = new OverloadTest();
        ob.test();
        ob.test(12);
        ob.test(5, 54);

        System.out.println("Результат " + ob.test(12.12));

    }
}
