package stringgenerics;
import java.util.*;
/**
 *@author vital
 * Смотрим что хранится в коллекциях на этапе компиляции
 */
public class StringGenerics {

    public static void main(String[] args) {
        List <String> strGenerics = new ArrayList<>();
        strGenerics.add("Hello");
        strGenerics.add("Septemer");
        strGenerics.add("43");
        String helloSeptember = strGenerics.get(0) + strGenerics.get(1);
        //assert - утверждения, о них пишет Хорстман в главе про Иссключения
        assert helloSeptember.equals("Hello September");
        
        
        for(int i = 0; i < strGenerics.size();i++)    
        {
        Class clazzGenerics = strGenerics.get(i).getClass();
        System.out.println(clazzGenerics.getClass());
      
        }
        System.out.println();
        
       //Тут код который без использования Generics
       List strWithout = new ArrayList();
       strWithout.add("Hello");
       strWithout.add("Generics"); 
       strWithout.add(1);
       System.out.println();
       //Смотрим что хранится в Листе, какие типы данных
       Class clazz = strWithout.get(2).getClass();
       System.out.println(clazz.getName());
       
       //каждый раз когда достаём элемент из списка, приходилось приводить типы
       String helloGenerics = ((String)strWithout.get(0)) +
               ((String)strWithout.get(1)) + " " + strWithout.get(2);
       
       assert helloGenerics.equals("1");
       
       System.out.println(helloGenerics);
       
       strWithout.forEach(e -> System.out.println(e.getClass());
       
      
       
    }
    
}

