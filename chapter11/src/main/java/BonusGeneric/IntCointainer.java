package BonusGeneric;

public class IntCointainer {
    private int [] array;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void print (){
        for (int a : array){
            System.out.println(a);
        }
    }
}
