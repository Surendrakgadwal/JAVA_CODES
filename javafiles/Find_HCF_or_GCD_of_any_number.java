/**
 * Created by GADWAL on 3/31/2017.
 */
public class Find_HCF_or_GCD_of_any_number{
        public static void main(String srgs[]){

            int num1=12,num2=30;
            int hcf=1,i;
            int min=(num1<num2)?num1:num2;

            for(i=1;i<=min;i++){

                if(num1%i==0&&num2%i==0){

                    hcf=i;

                }
            }
            System.out.print(hcf);


        }

}
