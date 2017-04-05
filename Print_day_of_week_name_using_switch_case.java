/**
 * Created by GADWAL on 3/30/2017.
 */
import java.util.Scanner;
public class Print_day_of_week_name_using_switch_case {

 public static void main(String args[]){

     int num;
     Scanner sc=new Scanner(System.in);

     num=sc.nextInt();

     switch(num) {
         case 0:
             System.out.println("Sunday");
             break;

         case 1:
             System.out.println("Monday");
             break;

         case 2:
             System.out.println("Tuesday");
             break;

         case 3:
             System.out.println("Wedneday");
             break;

         case 4:
             System.out.println("Thursday");
             break;

         case 5:
             System.out.println("Friday");
             break;

         case 6:
             System.out.println("saturday");
             break;

         default:
             System.out.println("Invalid number");


     }

 }



}
