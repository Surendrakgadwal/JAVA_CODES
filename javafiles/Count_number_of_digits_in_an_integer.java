/**
 * Created by GADWAL on 3/31/2017.
 */
public class Count_number_of_digits_in_an_integer {

    public static void main(String args[]){
        int num=1256356325;
        int count=0;
        while(num!=0){

            num=num/10;
            count++;
        }
        System.out.println(count);

    }

}
