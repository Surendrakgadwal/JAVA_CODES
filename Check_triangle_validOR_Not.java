/**
 * Created by GADWAL on 3/28/2017.
 */
import java.util.Scanner;
public class Check_triangle_validOR_Not {

    public static void main(String args[])
    {
        int a,b,c;
        a=b=c=0;

        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        System.out.println("Input of triangle are = " + "\n" + a + "\n" + b + "\n" + c);

        if( a + b > c ){
            if( b + c > a ){
                if( a + c > b ){
                    System.out.println("Valid");
                }
                else {
                    System.out.println("Not Valid");
                }
            }
            else {
                System.out.println("Not Valid");
            }
        }
        else{
            System.out.println("Not Valid");
        }
    }
}
