/**
 * Created by GADWAL on 3/31/2017.
 */
public class Program_to_print_given_number_in_word_form {

    public static void main(String args[]){

        int num=5641;
        int n=num,r,rev=0;
        System.out.println("Original Number is =" + num);
        while(n!=0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;


        }

        while(rev!=0) {
            switch (rev % 10) {
                case 0:
                    System.out.print("Zero ");
                    break;

                case 1:
                    System.out.print("One ");
                    break;

                case 2:
                    System.out.print("Two ");
                    break;

                case 3:
                    System.out.print("Three ");
                    break;

                case 4:
                    System.out.print("Four ");
                    break;

                case 5:
                    System.out.print("Fifth ");
                    break;

                case 6:
                    System.out.print("Six ");
                    break;

                case 7:
                    System.out.print("Seven ");
                    break;

                case 8:
                    System.out.print("Eight ");
                    break;

                case 9:
                    System.out.print("Nine ");
                    break;


            }
            rev=rev/10;


        }

    }


}
