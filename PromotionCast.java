/**
 * Created by GADWAL on 3/16/2017.
 */
public class PromotionCast {
    public static void main(String args[]){

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f*b) + (i/c) - (d*s);
        System.out.println((f*b) + " + " + (i/c) + " - " + (d*s));
        System.out.println("result = " + result);


        ball_count(new int[]{1,2,3,4,5},5,3);

    }


    public static int ball_count(int[] arr,int f,int k)
    {
        int siz = arr.length;
        int pow = (int)Math.pow(2,siz)-1;
        int max = 100000000;
        int i=1;
        while(pow>=i)
        {
            int count =0;

            int sum =0;
            for(int j=0;j<siz;j++)
            {
                if((i & 1<<j)!=0)
                {
                    count++;

                    sum +=arr[siz-j-1];

                }
            }
            if(count==k && sum%f==0 && max>sum)
            {
                max = sum;
            }
            i++;
        }

        return max;
    }
}
