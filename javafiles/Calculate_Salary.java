import java.util.Scanner;
public class Calculate_Salary {


        public static void main(String args[]){
            int salary;
            double hra,da;
<<<<<<< HEAD
            double gross_salary;
=======
	    double gross_salary;
>>>>>>> 82ce748c6ed8999d1f389fe1264e59b8d8c17ab8

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the salary:");

            salary=sc.nextInt();


            if(salary<=10000){
<<<<<<< HEAD
                hra = salary * 0.8;
                da = salary * 0.2;
=======
                hra = salary * 0.2;
                da = salary * 0.8;
>>>>>>> 82ce748c6ed8999d1f389fe1264e59b8d8c17ab8

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



