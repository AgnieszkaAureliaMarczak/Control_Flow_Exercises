package controlFlow;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        getGreatestCommonDivisor(12,30);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int divisor = 0;
        for (int i = first; i >= 1; i--) {
            if (first % i == 0) {
                if (second % i == 0) {
                    divisor = i;
                    return divisor;
                }
            }
        }
        return divisor;
    }
}
