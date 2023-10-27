package controlFlow;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11212));

    }

    public static boolean isPalindrome(int number) {
        int temp = number;
        int reverse = 0;
        while (temp != 0) {
            int lastDigit = temp % 10;
            reverse += lastDigit;
            reverse *= 10; //Increasing the place value of reverse by one
            temp /= 10;
        }
        reverse /= 10;
        return number == reverse;
    }
}
