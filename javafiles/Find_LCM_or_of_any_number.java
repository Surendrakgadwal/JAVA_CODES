/**
 * Created by GADWAL on 3/31/2017.
 */
public class Find_LCM_or_of_any_number {
    public static void main(String srgs[]){

        int num1=5,num2=7;
        int lcm=1;
        int max=(num1>num2)?num1:num2;

         int i=max;

         while(true){
             if(i%num1==0&&i%num2==0){

                 lcm=i;
                 break;

             } i=i+max;
         }

        System.out.print(lcm);


    }



}
