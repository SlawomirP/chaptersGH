package BonusGeneric;

public class Test {
    public static void main(String[] args) {
        print5Times(5);
        print5Times("abc");
    }

    private static <T> void print5Times(T i) {
        for (int j = 0; j < 5; j++) {
            System.out.println(i);
        }
    }
}
