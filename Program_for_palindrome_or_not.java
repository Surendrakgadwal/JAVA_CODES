/**
 * Created by GADWAL on 3/31/2017.
 */
public class Program_for_palindrome_or_not {

    public static void main(String args[]){

        int num=1234554321;
        int temp=num;
        int reverse=0,remainder=1;

        while(num!=0){
            remainder=num%10;
            reverse=reverse*10+remainder;
            num=num/10;
        }
        System.out.println();
        if(temp==reverse){
            System.out.println( temp + " is palindrom");
        }

        else{
            System.out.println( temp + " is not palindrom ");
        }

    }

}
