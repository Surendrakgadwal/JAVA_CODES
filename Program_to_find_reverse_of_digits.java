/**
 * Created by GADWAL on 3/31/2017.
 */
public class Program_to_find_reverse_of_digits {
    public static void main(String ags[]){

        int num=1253;
        int reverse;

        while(num!=0){
            reverse=num%10;
            System.out.print(+reverse);
            num=num/10;

        }



    }

}
