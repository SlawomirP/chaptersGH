import java.util.ArrayList;
import java.util.List;

public class SortMountains {
    public static void main(String[] args) {
        new SortMountains().go();
    }
    public void go () {
        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("Longs", 14255));
        mountains.add(new Mountain("Elbert", 14433));
        mountains.add(new Mountain("Maroon", 14156));
        mountains.add(new Mountain("Castle", 14265));
        System.out.println("as entered:\n" + mountains);

        mountains.sort((a,b) -> a.name.compareTo(b.name));
        System.out.println("by name:\n" + mountains);

        mountains.sort((a,b) -> b.height - a.height);
        System.out.println("by height:\n" + mountains);
    }
    class Mountain {
        String name;
        int height;

        public Mountain(String name, int hight) {
            this.name = name;
            this.height = hight;
        }

        public String getName() {
            return name;
        }

        public int getHeight() {
            return height;
        }

        @Override
        public String toString() {
            return name + " " + height;
        }
    }
}
