package BonusLists;

public class Test {
    public static void main(String[] args) {

        String[] myList = {"a", "b", "c"};

        System.out.println(Test.isIn(myList,"d"));


    }


    public static boolean isIn(String[] myList, String word) {
        boolean result = false;
        for (String e : myList) {
            if (e.equals(word)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
