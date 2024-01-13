public class OuterClass {
    private int x;
    InnerClass innerObj = new InnerClass();

    public void doStuff() {
        innerObj.go();
    }


    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();

        System.out.println(outerClass.x);

        outerClass.innerObj.go();

        System.out.println("**********");
        System.out.println(outerClass.x);
    }

    class InnerClass {
        void go() {
            x = 42;
        }
    }
}
