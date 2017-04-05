/**
 * Created by GADWAL on 3/28/2017.
 */
import java.util.Scanner;
public class Find_profit_loss {
    public static void main(String args[]){
        int cp,sp,profit,loss;

        Scanner sc=new Scanner(System.in);
        cp=sc.nextInt();
        sp=sc.nextInt();

        if(sp>cp){
            profit=sp-cp;
            System.out.println("Profit is" + profit);
        }
        else if(cp>sp)
        {
            loss=cp-sp;
            System.out.println("loss is" + loss);
        }
        else{
            System.out.println("No Profit No loss");
        }

    }
}
