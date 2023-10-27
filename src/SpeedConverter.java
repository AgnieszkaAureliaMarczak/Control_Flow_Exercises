public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(75.114));
        printConversion(25.42);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long milesPerHour = 0;
        if (kilometersPerHour < 0) {
            return -1;
        } else if (kilometersPerHour > 0) {
            milesPerHour = Math.round(kilometersPerHour / 1.609);
            return milesPerHour;
        }
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value.");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
