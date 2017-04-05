/**
 * Created by GADWAL on 3/27/2017.
 */
public class check_number_divisibleby_5_or_11
{
    public static void main(String rgs[]){

        int a=55;
        if ( a % 5 == 0 && a % 11 == 0)
        {
            System.out.println("It's divisible by 5 and 11");

        }
        else
        {
            System.out.println("not divisible by 5 and 11 ");
        }
    }

}
