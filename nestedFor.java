/**
 * Created by GADWAL on 3/19/2017.
 */
public class nestedFor {
    public static void main (String args[])
    {
        int n=1;
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(+n+" " +
                        "");
                n++;
            }
            System.out.println("");
        }

    }

}
