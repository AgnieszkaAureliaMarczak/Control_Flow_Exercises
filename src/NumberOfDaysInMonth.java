public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(1,-2020));
    }

    public static boolean isLeapYear(int year) {
        boolean leapYear;
        if ((year < 1) || (year > 9999)) {
            return false;
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            leapYear = true;
            return leapYear;
        } else if (year % 400 == 0) {
            leapYear = true;
            return leapYear;
        } else {
            leapYear = false;
            return leapYear;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        int days = 0;
        if ((month < 1) || (month > 12)) {
            return -1;
        }
        if ((year < 1) || (year > 9999)) {
            return -1;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                return days;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                return days;
            case 2:
                if (isLeapYear(year)) {
                    days = 29;
                    return days;
                } else {
                    days = 28;
                    return days;
                }
        }
       return days;
    }
}
