/**
 * Created by GADWAL on 3/31/2017.
 */
public class Prime_factor_of_any_number {
    public static void main(String args[]) {

        int num,count;
        int n=50;
        System.out.println(" The prime numbers between 1 and 100 : \n");
        for (num = 2; num <= n; ++num) {
            count = 0;
            if(n%num==0){
            for (int k = 2; k < num; k++) {
                if ((num % k) == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0)
                System.out.println(num + " ");

        }
        }

    }

}
