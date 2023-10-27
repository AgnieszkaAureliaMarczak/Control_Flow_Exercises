package exercises_ExpressionsAndStatements;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-2017));
    }
    public static boolean isLeapYear(int year){
        boolean leapYear;
        if (year <1 || year>9999){
            leapYear = false;
        } else if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    leapYear = true;
                } else {
                    leapYear = false;
                }
            } else {
                leapYear = true;
            }
        } else {
            leapYear = false;
        }
        return leapYear;
    }
}
