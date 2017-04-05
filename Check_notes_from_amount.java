/**
 * Created by GADWAL on 3/28/2017.
 */
import java.util.Scanner;
public class Check_notes_from_amount {
    public static void main(String args[]){
        int note500, note100, note50, note20, note10, note5, note2, note1;
        note500 = note100 = note50 = note20 = note10=  note5=  note2 = note1=0;
        
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
	System.out.println("The Amount is" + amount);
        
        if(amount>=500){
            note500=amount/500;
            amount=amount-note500*500;

            }
        if(amount>=100) {
            note100 = amount / 100;
            amount = amount - note100 * 100;

        }

        if(amount>=50) {
            note50 = amount / 50;
            amount = amount - note50 * 50;

        }

        if(amount>=20) {
            note20 = amount / 20;
            amount = amount - note20 * 20;

        }

        if(amount>=10) {
            note10 = amount / 10;
            amount = amount - note10 * 10;

        }

        if(amount>=5) {
            note5 = amount / 5;
            amount = amount - note5 * 5;

        }

        if(amount>=2) {
            note2 = amount / 2;
            amount = amount - note2 * 2;

        }

        if(amount>=1) {
            note1 = amount / 1;
            amount = amount - note1 * 1;

        }

	System.out.println("Total no. of notes are = ");
	System.out.println("500 = " + note500);
        System.out.println("100 = " + note100);
	System.out.println("50 = " + note50);
	System.out.println("20 = " + note20);
	System.out.println("10 = " + note10);
	System.out.println("5 = " + note5);
	System.out.println("2 = " + note2);
	System.out.println("1 = " + note1);
}
}
