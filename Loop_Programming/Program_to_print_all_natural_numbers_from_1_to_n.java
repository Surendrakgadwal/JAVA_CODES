/**
 * Created by GADWAL on 3/30/2017.
 */
import java.util.Scanner;
public class Program_to_print_all_natural_numbers_from_1_to_n {
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        
        i=1;

        while(i<=n){
            System.out.println(+i);
            i++;
        }


    }


}
