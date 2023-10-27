package exercises_ExpressionsAndStatements;

public class TeenNumberChecker {
    public static void main(String[] args) {
      //  System.out.println(hasTeen(22, 23, 34));
        System.out.println(isTeen(13));
    }
    public static boolean hasTeen(int firstTeen, int secondTeen, int lastTeen){
        return (firstTeen >= 13 && firstTeen <=19) || (secondTeen >= 13 && secondTeen <= 19) || (lastTeen >=13 && lastTeen <= 19);
    }
    public static boolean isTeen (int age){
        return age >= 13 && age <= 19;
    }
}
