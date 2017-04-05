/**
 * Created by GADWAL on 3/30/2017.
 */
import java.util.Scanner;
public class Create_calculator_using_switch_case {
    
    public static void main(String args[])
    {
        float num1, num2;
        float result;
        char op;
        
        Scanner sc=new Scanner(System.in);
        num1=sc.nextFloat();
        num2=sc.nextFloat();
        
        op=sc.next().charAt(0);
        
        switch(op){
            
            case '+':
                result=num1+num2;
                System.out.println("Result of " + num1 + " and " + num2 + " is " + result);
                break;

            case '-':
                result=num1-num2;
                System.out.println("Result of " + num1 + " and " + num2 + " is " + result);
                break;

            case '*':
                result=num1*num2;
                System.out.println("Result of " + num1 + " and " + num2 + " is " + result);
                break;

            case '/':
                result=num1/num2;
                System.out.println("Result of " + num1 + " and " + num2 + " is " + result);
                break;

            case '%':
                result=num1%num2;
                System.out.println("Result of " + num1 + " and " + num2 + " is " + result);
                break;
                
            default:
                System.out.println("Invalid operation");
        }
        
        
    }
    
}
