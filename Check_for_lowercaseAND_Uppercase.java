

/**
 * Created by GADWAL on 3/28/2017.
 */
import java.util.Scanner;
public class Check_for_lowercaseAND_Uppercase {
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);

        if(ch>='a'&&ch<='z')
        {
            System.out.println("character in lower case");
        }
        else if(ch>='A'&&ch<='Z')
        {
            System.out.println("character in Upper case");
        }
        else
        {
            System.out.println("it is not char");
        }
}
}