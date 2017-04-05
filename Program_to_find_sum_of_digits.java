/**
 * Created by GADWAL on 3/31/2017.
 */
public class Program_to_find_sum_of_digits {

    public static void main(String ags[]){

        int num=12536;
        int sum=0;

        while(num!=0){
            sum=sum+num%10;
            num=num/10;

        }
        System.out.println("The sum of the given number is = " +sum);



    }

}
