import java.util.Scanner;
public class Program_to_print_number_of_days_in_a_month_using_switch_case {
    public static void main(String args[]){

        int month;
        Scanner sc=new Scanner(System.in);

        month=sc.nextInt();

        switch(month)
        {
            case 1: System.out.println("31 days");
                break;
            case 2: System.out.println("28/29 days");
                break;
            case 3: System.out.println("31 days");
                break;
            case 4: System.out.println("30 days");
                break;
            case 5: System.out.println("31 days");
                break;
            case 6: System.out.println("30 days");
                break;
            case 7: System.out.println("31 days");
                break;
            case 8: System.out.println("31 days");
                break;
            case 9: System.out.println("30 days");
                break;
            case 10: System.out.println("31 days");
                break;
            case 11: System.out.println("30 days");
                break;
            case 12: System.out.println("31 days");
                break;
            default: System.out.println("Invalid input! Please enter month number between 1-12");



        }

    }
}
