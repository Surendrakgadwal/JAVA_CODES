/**
 * Created by GADWAL on 3/30/2017.
 */
public class Check_Least_Significant_Bit_LSB {
    public static void main(String args[]) {


        int a = 12;
        if (a & 1) {
            System.out.println("Least Significant Bit (LSB) of %d is set (1)." + a);
        } else {
            System.out.println("Least Significant Bit (LSB) of %d is set (o)." + a);
        }


    }
}