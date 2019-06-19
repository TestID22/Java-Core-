class VarArgs2{
    static void tester (String msg, int ...v){
        System.out.println(v.length + "аргументов было переданно");
        for ( int x: v )
            System.out.println("Аргументы переданные :" + x);
            System.out.println(msg);
    }
}


public class VarArgs {
    public static void main(String[] args) {
        VarArgs2.tester("Тут пишу строку",4,6);
        VarArgs2.tester("Эллиот", 3,3,1,43,6,8,1);
    }
}
