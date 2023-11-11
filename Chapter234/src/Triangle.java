public class Triangle {

    double area;
    int height;
    int length;

    public static void main(String[] args) {

        int orig = 42;
        Triangle t = new Triangle();
        int y = t.go(orig);
        System.out.println(orig + " " + y);



    }

    int go(int arg) {
        return arg * 2;
    }
}
