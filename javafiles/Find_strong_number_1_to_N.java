/**
 * Created by GADWAL on 3/31/2017.
 */
public class Find_strong_number_1_to_N
{

    public static void main(String args[])
    {
        int end=100000,cur;
        int j,i,r;

        long sum,fact;

        for(i=1;i<=end;i++)
        {
            cur=i;
            sum=0;
            while (cur > 0)
            {
                fact = 1;
                r = cur % 10;

                for (j = 1; j <= r; j++) {
                    fact = fact * j;
                }
                sum = sum + fact;
                cur = cur / 10;


            }

            if (sum == i) {
                System.out.println("Strong number " + i);
            }
        }
    }

}
