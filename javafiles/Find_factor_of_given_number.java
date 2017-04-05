/**
 * Created by GADWAL on 3/31/2017.
 */
public class Find_factor_of_given_number {

    public static void main(String srgs[]){

        int num=12;
        for(int i=1;i<=num;i++){

            if(num%i==0){
                System.out.print(i+ " ");
            }
        }


    }

}
