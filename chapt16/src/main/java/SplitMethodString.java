public class SplitMethodString {
    public static void main(String[] args) {
        String text = "this is/split text/by this sign";

        String [] result = text.split("/");

        for (String s : result){
            System.out.println(s);
        }
    }
}
