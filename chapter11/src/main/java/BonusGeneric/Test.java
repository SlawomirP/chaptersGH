package BonusGeneric;

public class Test {
    public static void main(String[] args) {
//        IntCointainer intCointainer = new IntCointainer();
//        intCointainer.setArray(new int[]{1,2,3,4,5,6});
//        intCointainer.print();
//        int i = intCointainer.getArray()[0];
//        int j = intCointainer.getArray()[1];
//        System.out.println("-> " + (i+j));
//        System.out.println();
//        StringCointainer StringCointainer = new StringCointainer();
//        StringCointainer.setArray(new String[]{"abc","bbc","cbc","dbc","ebc"});
//        StringCointainer.print();
//        System.out.println();

        Cointainer <Integer> cointainer = new Cointainer<>();
        cointainer.setArray(new Integer[]{1,2,3,4,5});
        cointainer.print();



    }
}
