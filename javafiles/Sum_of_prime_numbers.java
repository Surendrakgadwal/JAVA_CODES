/**
 * Created by GADWAL on 3/31/2017.
 */
public class Sum_of_prime_numbers {
    public static void main(String args[]) {

        int num,count;
        long sum=0;
        System.out.println(" The prime numbers between 1 and 100 : \n");
        for (num = 2; num <= 100; ++num) {
            count = 0;
            for (int k = 2; k < num; k++) {
                if ((num % k) == 0) {
                    count++;
                    break;
                }
            }
            sum=sum+num;
            if (count == 0)
                System.out.println(num + " ");

        }
        System.out.println("Sum of prime number is = " + sum );
    }

}
