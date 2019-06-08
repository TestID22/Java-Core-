public class MrRobot {

    public static void main(String[] args){

        Fscociety[] hackers = new Fscociety[3]; //Массив из объектов - экзмпляров
        hackers[0] = new Fscociety("Elliot Anderson", 50000.0, 33); //init
        hackers[1] = new Fscociety("Darling", 0, 32);
        hackers[2] = new Fscociety("Tyrel Walick", 100000.0,35);

        for (Fscociety element: hackers){ // перебор массива
            element.raiseSalary(5); // поднимем зарплату на 5%
            System.out.println("Имя: " + element.GetName() +
                    "\nЗарплата " + element.getSalary()
                    + "\tВозраст :" + element.getAge());
        }


    }
    static class Fscociety{ // Создание класса
        private String name; // поля класса, или атрибуты если хотите
        private double salary;
        private int age;

    public Fscociety(String n, double s, int a){
        name = n; // связываем параметры конструктора с полями.
        salary = s;
        age = a;
    }
    public String GetName(){ // методы функции
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;

    }
    }
}
