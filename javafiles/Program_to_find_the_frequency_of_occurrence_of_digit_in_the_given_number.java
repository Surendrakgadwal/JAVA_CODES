/**
 * Created by GADWAL on 3/31/2017.
 */
public class Program_to_find_the_frequency_of_occurrence_of_digit_in_the_given_number {

    public static void main(String args[]){

        long num=155535551;
        int digit=5;
        long reverse=0,remainder=1,count=0;

        while(num!=0){
            remainder=num%10;
            if(remainder==digit) {
                count++;
            }
                num = num / 10;

        }
        System.out.println(count);

    }

}




