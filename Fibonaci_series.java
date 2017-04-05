/**
 * Created by GADWAL on 3/31/2017.
 */
public class Fibonaci_series {

    public static void main(String args[])
    {
        int n=10;
        int a=0,b=1,c=0;

        for(int i=1; i<=n; i++){

            System.out.println(+c + " ");
            a=b;
            b=c;
            c=a+b;
        }
    }
}
