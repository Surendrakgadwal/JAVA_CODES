/**
 * Created by GADWAL on 3/31/2017.
 */
public class Prime_number_from_1_to_N {
    public static void main(String args[]) {

        int num,count;
        System.out.println(" The prime numbers between 1 and 100 : \n");
        for (num = 2; num <= 100; ++num) {
            count = 0;
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