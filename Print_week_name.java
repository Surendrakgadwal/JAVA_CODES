import java.util.Scanner;
public class Print_week_name {
    public static void main(String args[]){

        int number;
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        if(number==0)
        {
            System.out.println("Sunday");
        }
        else if(number==1)
        {
            System.out.println("Monday");
        }
        else if(number==2)
        {
            System.out.println("Tuesday");
        }

        else if(number==3)
        {
            System.out.println("wednesday");
        }

        else if(number==4)
        {
            System.out.println("Thursday");
        }

        else if(number==5)
        {
            System.out.println("Friday");
        }

        else if(number==6)
        {
            System.out.println("Saturday");
        }

        else{

            System.out.println("Invalid eneter");
        }


    }
}
