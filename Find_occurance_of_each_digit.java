/**
 * Created by GADWAL on 3/31/2017.
 */
public class Find_occurance_of_each_digit {

    public static void main(String args[]){
        int num=563245;
        int countMap[] = new int[10];
        int r;

        while(num > 0){
            r = num % 10;
            countMap[r] ++;
            num = num/10;
        }

        for(int i =0; i<=9;i++){
            System.out.println(i +" => "+countMap[i]);
        }


    }

}
