public class Operations {
    private static int firstNumber;
    private static int secondNumber;

    public Operations(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int divide(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }

    public int plus(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public int minus(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    public int multy(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }
}
