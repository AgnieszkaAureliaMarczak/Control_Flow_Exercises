package controlFlow;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(-3,2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }
        if ((bigCount * 5) + smallCount < goal) {
            return false;
        }
        return smallCount >= goal%5;
    }
}
