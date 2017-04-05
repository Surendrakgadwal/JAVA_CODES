/**
 * Created by GADWAL on 3/31/2017.
 */
public class Find_prime_number {

    public static void main(String args[])
    {
        int num=99, i, count=0;

        for(i=2; i<num; i++)
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.print("This is a Prime Number");
        }
        else
        {
            System.out.print("This is not a Prime Number");
        }
    }
}
