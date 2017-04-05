/**
 * Created by GADWAL on 3/31/2017.
 */
public class Check_for_strong_number {

    public static void main(String args[]){

        int num=40585,temp;
        int i,fact,r;
        temp=num;
        int sum=0;


        while(num>0){
            r=num%10;
            fact=1;
            for(i=1;i<=r;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            num=num/10;



        }

        if(sum==temp){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not Strong number");
        }



    }


}
