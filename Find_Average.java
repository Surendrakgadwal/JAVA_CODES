/**
 * Created by GADWAL on 3/28/2017.
 */
import java.util.Scanner;
public class Find_Average {
    public static void main(String args[]){
        int hindi,eng,math,phy,sci;
        float per;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter five subjects marks:");

        hindi=sc.nextInt();
        eng=sc.nextInt();
        math=sc.nextInt();
        phy=sc.nextInt();
        sci=sc.nextInt();

        per = (hindi + eng + phy + math + sci) / 5;
        System.out.println("Percentage is " + per);

        if(per>=90){
            System.out.println("A Grade");
        }

        else if(per>=80){
            System.out.println("B Grade");
        }

        else if(per>=70){
            System.out.println("C Grade");
        }

        else if(per>=60){
            System.out.println("D Grade");
        }

        else if(per>=40){
            System.out.println("E Grade");
        }

        else {
            System.out.println("F Grade");
        }




    }
}
