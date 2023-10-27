package controlFlow;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        boolean isPrimeNumber = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }


        if (isPrimeNumber) {
            return number;
        } else {
            int primeFactor = 0;
            for (int i = number / 2; i >= 2; i--) {
                if (number % i == 0) {
                    boolean isPrimeFactor = true;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            isPrimeFactor = false;
                            break;
                        }
                    }
                    if (isPrimeFactor) {
                        primeFactor = i;
                        return primeFactor;
                    }
                }
            }
            return primeFactor;
        }
    }
    /*public class LargestPrime {
        public static int getLargestPrime(int number) {
            if (number < 2) return -1;
            for (int i = 2; i < number; i++) { // can optimize with i <= number/2;
                if (number % i == 0){
                    number /= i;
                    i--; // neutralize the i++ increment to check i again
                }
            }
            return number;
        }
    }*/

    /*public static int getLargestPrime(int number) { <<<<< najbardziej optymalne rozwiazanie
        if(number <= 1) return -1;
        for(int i = number/2; i >= 2; i--) { // optimized, start at number/2
            if(number % i == 0) {
                number = i;
            }
        }
        return number;
    }*/
}
