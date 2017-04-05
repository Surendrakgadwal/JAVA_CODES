/**
 * Created by GADWAL on 3/28/2017.
 */
public class Check_leaf_year {
    public static void main(String args[]){
        int year =1004;
        if(year>=1000&&year<=2017)
        {
            if(year%4==0) {
                System.out.println("Leaf year");
            }
            else{
                System.out.println("not leaf year");

            }
}
        else{
            System.out.println("Invalid year");
        }
    }
}
