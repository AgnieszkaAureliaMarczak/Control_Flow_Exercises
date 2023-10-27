package controlFlow;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(90, 992, 999));
    }
    public static boolean hasSameLastDigit (int firstNumber, int secondNumber, int thirdNumber){
        if (!isValid(firstNumber) || !isValid(secondNumber) || !isValid(thirdNumber)){
            return false;
        }
        return firstNumber % 10 == secondNumber % 10 || firstNumber % 10 == thirdNumber % 10 || secondNumber % 10 == thirdNumber % 10;
    }
    public static boolean isValid(int number){
        return ((number >= 10) && (number <= 1000));
    }
}
