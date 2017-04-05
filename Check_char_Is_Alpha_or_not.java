/**
 * Created by GADWAL on 3/28/2017.
 */
import java.util.Scanner;
public class Check_char_Is_Alpha_or_not {
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){

                System.out.println("Char is Alphabate");

            }
            else
            {

            System.out.println("Char is not Alphabate");


            }
    }

}
