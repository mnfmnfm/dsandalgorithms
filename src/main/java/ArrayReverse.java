import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        System.out.println("hello world");
        int result = addition(1,1);
        System.out.println("addition(1,1) gave back " + result);

        // let's loop through an array
        String[] fruits = new String[4];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cantaloupe";
        fruits[3] = "dragonfruit";
        for(int i = 0; i < fruits.length; i++) {
            fruits[i] = fruits[i] + "s";
        }
        System.out.println(Arrays.toString(fruits));
    }
//
//    public static String[] reverse(String[] arrayToReverse) {
//
//    }

    public static int addition(int a, int b) {
        return a + b;
    }
}
