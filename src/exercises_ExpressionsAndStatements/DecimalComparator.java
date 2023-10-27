package exercises_ExpressionsAndStatements;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
    }
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        return (int) (firstNumber * 1000) == (int) (secondNumber * 1000);
    }
}
