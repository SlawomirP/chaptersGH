package BonusGeneric;

public class StringCointainer {
    private String [] array;

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void print (){
        for (String a : array){
            System.out.println(a);
        }
    }
}
