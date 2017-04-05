/**
 * Created by GADWAL on 3/28/2017.
 */
import java.util.Scanner;
import java.lang.*;
public class find_roots_of_quadratic_equation {

    public static void main(String args[]){
        int a,b,c;
        double root1,root2,discriminant,imaginary;

        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();


        discriminant=(b*b)-(4*a*c);

        if(discriminant>0){
            root1 = (-b + Math.sqrt(discriminant)) / (2*a);
            root2 = (-b - Math.sqrt(discriminant)) / (2*a);
            System.out.println("root1 and root2 is : = " + root1 + root2);

        }

        else if(discriminant == 0){
            root1 = root2 = -b / (2*a);
            System.out.println("root1 is : = " + root1);

        }

        else if(discriminant<0){
            root1 = root2 = -b / (2*a);

            imaginary = Math.sqrt(-discriminant) / (2*a);

            System.out.println("root1 and imaginary OR root2 and imaginary is : = " + root1 + imaginary + root2 + imaginary);

        }
    }

}
