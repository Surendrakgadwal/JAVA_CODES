import java.util.Scanner;
public class Calculate_Salary {


        public static void main(String args[]){
            int salary;
            double hra,da;
	    double gross_salary;

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the salary:");

            salary=sc.nextInt();


            if(salary<=10000){
                hra = salary * 0.2;
                da = salary * 0.8;

            }

            else if(salary<=20000){
                hra = salary * 0.25;
                da = salary * 0.9;

            }
            else {
                hra = salary * 0.3;
                da = salary * 0.95;
            }

            gross_salary = salary+da+hra;
            System.out.println("gross_salary is " + gross_salary);


        }
    }



