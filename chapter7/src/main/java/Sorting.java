import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        int[] for0Test = {};
        int[] for5Test = {1, 1, 1, 1, 1};
        int[] toSort = {5, 1, 4, 2, 3};

        System.out.println(Arrays.toString(getSorted(toSort)));

        System.out.print("Test for 0 elements: ");
        System.out.println(Arrays.toString(getSorted(for0Test)));
        System.out.print("Test for all 1: ");
        System.out.println(Arrays.toString(getSorted(for5Test)));
        System.out.print("Should be: 1,2,3,4,5: ");
        System.out.println(Arrays.toString(getSorted(toSort)));
    }

    public static int[] getSorted(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                int tempL = numbers[j];
                int tempR = numbers[j + 1];
                if (tempR < tempL) {
                    numbers[j] = tempR;
                    numbers[j + 1] = tempL;
                }
            }
        }
        return numbers;
    }
}
