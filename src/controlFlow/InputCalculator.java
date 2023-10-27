package controlFlow;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                sum += number;
                count++;
            } catch (NumberFormatException notNumber) {
                break;
            }
        } while (true);
        long average = Math.round((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
