public class BadNumExeption extends Exception{

    private int number;
    public int getNumber(){
        return number;
    }
    public BadNumExeption(String message, int num){

        super(message);
        number = num;
    }
}
