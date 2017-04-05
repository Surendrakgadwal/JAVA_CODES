/**
 * Created by GADWAL on 3/28/2017.
 */
import java.util.Scanner;
public class Check_for_number_char_or_specialChar {
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);

        if((ch>='a'&&ch<='z')||(ch>='A'&&ch>='Z'))
        {
            System.out.println("It is character");
        }

        else if(ch>='0'&&ch<='9')
        {
            System.out.println("It is Digit");
        }

        else
        {
            System.out.println("It is Special character");
        }




    }

}
