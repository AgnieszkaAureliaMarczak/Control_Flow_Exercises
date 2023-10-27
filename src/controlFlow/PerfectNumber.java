package controlFlow;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(5));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        int increment = (number % 2 == 0) ? 1 : 2;

        for (int i = 1; i <= number/2; i+= increment) {
            if (number % i == 0) {
                sum += i;
            }
        }
            return sum == number;
    }
}
