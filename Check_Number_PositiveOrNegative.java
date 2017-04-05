/**
 * Created by GADWAL on 3/27/2017.
 */
import java.util.Scanner;
public class Check_Number_PositiveOrNegative {

    public static void main(String srgs[]){

        Scanner sc= new Scanner(System.in);
        int n;
        n = sc.nextInt();
        if(n>0)
        {
            System.out.println("number is positive");
        }
        else{
            if(n==0)
            {
                System.out.println("number is zero");
            }
else{
        System.out.println("number is negative");
}
}

    }


}
