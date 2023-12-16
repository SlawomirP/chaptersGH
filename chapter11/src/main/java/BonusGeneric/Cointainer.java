package BonusGeneric;

public class Cointainer <T> { // tworzc obiekt tej klasy musimy zamiast T (skrot od type)okrelic typ OBIEKTOWY - nie prymityw !!!

    T [] array;

    public T[] getArray() { // pobierze tablice T <- odpowiedniego typu
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public void print () {
        for (T t : array){
            System.out.println(t);
        }
    }
}
