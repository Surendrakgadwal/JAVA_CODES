/**
 * Created by GADWAL on 3/31/2017.
 */
public class Print_the_sum_of_odd_numbers_from_1_to_n {
    public static void main(String args[]){

        int num=100,sum=0;
        int i=1;
        while(i<=num){

            if(i%2==1) {
                sum = sum + i;

            }
            i++;

        }
        System.out.println(sum);



    }

}
