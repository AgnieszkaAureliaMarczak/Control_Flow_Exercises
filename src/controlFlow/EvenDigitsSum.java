package controlFlow;

public class EvenDigitsSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        int sum = 0;
        do {
            sum += ((number % 10) % 2 == 0) ? number % 10 : 0;
            number /= 10;
        } while (number != 0);
          return sum;
    }
}
