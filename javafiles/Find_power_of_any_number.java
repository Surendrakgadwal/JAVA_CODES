/**
 * Created by GADWAL on 3/31/2017.
 */
public class Find_power_of_any_number {

    public static void main(String args[]) {

        int base = 2;
        int exponent = 100;
        double power=1;

        for(int i=1;i<=exponent;i++){
             power=power*base;
        }

        System.out.println("Power is = " + power);

    }
}