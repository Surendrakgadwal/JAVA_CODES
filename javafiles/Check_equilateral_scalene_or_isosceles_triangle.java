

/**
 * Created by GADWAL on 3/28/2017.
 */
import java.util.Scanner;
public class Check_equilateral_scalene_or_isosceles_triangle {

    public static void main(String args[]) {
        int a, b, c, sum;
        a = b = c = 0;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println("Input of triangle are = " + "\n" + a + "\n" + b + "\n" + c);

        if (a == b && b == c) {
            System.out.println("equilateral");
        } else if (a == b || a == c || b == c) {
            System.out.println("isosceles");

        } else {
            System.out.println("scalene");
        }

    }
}