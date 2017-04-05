/**
 * Created by GADWAL on 3/23/2017.
 */

public class ReverseString {

    public static void main(String[] args) {

        String str = "Aezion";

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}