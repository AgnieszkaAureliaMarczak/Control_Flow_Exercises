package exercises_ExpressionsAndStatements;

public class MegaBytesConverter {
    public static void main(String[] args) {
printMegaBytesAndKiloBytes(5000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megabytes = kiloBytes / 1024;
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + kiloBytes % 1024 + " KB");
        }
    }
}
