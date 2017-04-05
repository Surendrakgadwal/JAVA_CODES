/**
 * Created by GADWAL on 3/16/2017.
 */
public class Scope {


    public static void main(String args[]){

        int x;
        x=10;
        int y=20;
        if(x==10){

            System.out.println("x and y: " + x + " " + y);
            x=y*2;

        }

        System.out.println("x is: " + x);
    }

}
