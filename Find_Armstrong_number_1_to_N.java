/**
 * Created by GADWAL on 3/31/2017.
 */
public class Find_Armstrong_number_1_to_N {

    public static void main(String args[]){

        int num=500;
        int rev=0,r=0,sum=0,temp=0;
       int n;
        for(int i=0;i<=num;i++) {

            n = i;
            while (n > 0) {

                r = n % 10;
                sum = sum + r * r * r;
                n = n / 10;
            }
            if (sum == i) {
                System.out.println("Armstrong no is = " +  i );
            }
            sum = 0;

        }

    }
}
