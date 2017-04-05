/**
 * Created by GADWAL on 3/30/2017.
 */
public class Find_maximum_between_three_numbers_using_ternary_operator {

    public static void main(String ags[]){
        int a=10,b=25, c=50;

        int max=(a>b&&a>c)?a:(b>c)?b:c;
        System.out.println("Maximum number of " + a + " and " + b + " and " + c + " is = " +max);


    }
}
