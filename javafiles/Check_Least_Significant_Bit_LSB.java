/**
 * Created by GADWAL on 3/30/2017.
 */
public class Check_Least_Significant_Bit_LSB {
    public static void main(String args[]) {


        int a = 12;
<<<<<<< HEAD
        if (a < 1) {
=======
        if (a & 1) {
>>>>>>> 82ce748c6ed8999d1f389fe1264e59b8d8c17ab8
            System.out.println("Least Significant Bit (LSB) of %d is set (1)." + a);
        } else {
            System.out.println("Least Significant Bit (LSB) of %d is set (o)." + a);
        }


    }
}