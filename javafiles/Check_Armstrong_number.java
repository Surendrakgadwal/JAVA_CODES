/**
 * Created by GADWAL on 3/31/2017.
 */
public class Check_Armstrong_number {
    public static void main(String args[]){

        int num=407;
        int rev=0,r=0,sum=0,temp=0;
        temp=num;
        while(num!=0){

            r=num%10;
            sum=sum+r*r*r;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("Armstrong");
        }

        else{
            System.out.println("Not Armstrong");
        }


    }

}
