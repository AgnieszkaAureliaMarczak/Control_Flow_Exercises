package controlFlow;

public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);
        printNumberInWord(-10);
    }

    public static void printNumberInWord(int number) {
        String numberAsWord;
        switch (number) {
            case 0:
                numberAsWord = "ZERO";
                break;
            case 1:
                numberAsWord =
                        "ONE";
                break;
            case 2:
                numberAsWord =
                        "TWO";
                break;
            case 3:
                numberAsWord =
                        "THREE";
                break;
            case 4:
                numberAsWord =
                        "FOUR";
                break;
            case 5:
                numberAsWord =
                        "FIVE";
                break;
            case 6:
                numberAsWord =
                        "SIX";
                break;
            case 7:
                numberAsWord =
                        "SEVEN";
                break;
            case 8:
                numberAsWord =
                        "EIGHT";
                break;
            case 9:
                numberAsWord =
                        "NINE";
                break;
            default:
                numberAsWord =
                        "OTHER";
                break;
        }
        System.out.println(numberAsWord);
    }
}
