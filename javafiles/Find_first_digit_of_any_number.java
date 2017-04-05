/**
 * Created by GADWAL on 3/31/2017.
 */
public class Find_first_digit_of_any_number {

public static void main(String args[]){

    int num=1234;
    int first=num,last;

    while(first>=10){
        first=first/10;
    }
    System.out.println("First digit of the given number is = " + first);

    last=num%10;
    System.out.println("last digit of the given number is = " + last);
}


}
