public class Chapt1 {
    public static void main(String[] args) {

        int x = 1;
        while (x < 3) {
            System.out.print("Doo");
            System.out.print("Bee");
            x++;
        }
        if (x == 3) {
            System.out.print("Do");
        }
        System.out.println();

        int bottlesNum = 10;
        String word = "bottles";
        while (bottlesNum > 0) {
            if (bottlesNum == 1) {
                word = "bottle"; // singular, as in ONE bottle.
            }
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall,");
            bottlesNum = bottlesNum - 1;
            if (bottlesNum > 0) {
                System.out.println("There'll be " + bottlesNum +
                        " green " + word + ", hanging on the wall");
            } else {
                System.out.println("There'll be no green bottles, hanging on the wall");
            }
        }
        System.out.println();

        System.out.println("----------- Code magnet");

//        class Shuffle1 {
//            public static void main(String [] args) {
        x = 3;

        while (x > 0) {

            if (x > 2) {
                System.out.print("a");
            }
            x--;
            System.out.print("-");
            if (x == 2) {
                System.out.print("b c");
            }

            if (x == 1) {
                System.out.print("d");
                x--;
            }
        }
        System.out.println();
        System.out.println("---------------------- BE the Compiler");
        System.out.println();

        System.out.println("1a");

        x = 1;
        while (x < 10) {
            if (x > 3) {
                System.out.println("big x");
            }
            x++;
        }

        System.out.println("1b");

        x = 5;
        while (x > 1) {
            x--;
            System.out.println("small x");
        }

        System.out.println("1c");

        x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("small x");
            }
        }

        System.out.println();
        System.out.println("Pool puzzle + \n");


        x = 0;

        while ( x < 4 ) {

            System.out.print("a");

            if ( x < 1 ) {
                System.out.print(" ");
            }

            System.out.print("n");

            if ( x > 1 ) {
                System.out.print(" oyster");
                x += 2;
            }

            if ( x == 1 ) {
                System.out.print("noys");
            }

            if ( x < 1 ) {
                System.out.print("oise");
            }

            System.out.println();
            x ++;
        }
    }
}


