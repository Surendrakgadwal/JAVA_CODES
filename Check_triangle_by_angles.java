/**
 * Created by GADWAL on 3/28/2017.
 */
import java.util.Scanner;
public class Check_triangle_by_angles  
{
    public static void main(String args[])
    {
         int a,b,c,sum;
         a=b=c=sum=0;
         
         Scanner sc=new Scanner(System.in);
         a=sc.nextInt();
         b=sc.nextInt();
         c=sc.nextInt();
         
         sum=a+b+c;
         
         if(sum==180){
             System.out.println("Valid Triangle");
         }
         else{
             System.out.println("Not Valid");
         }
        
    }
}
