/**
 * Created by GADWAL on 3/31/2017.
 */
public class Program_to_find_product_of_digits {

    public static void main(String ags[]){

        int num=1253;
        long product=1;

        while(num!=0){
            product=product*(num%10);
            num=num/10;

        }
        System.out.println("The product of the given number is = " +product);



    }

}
