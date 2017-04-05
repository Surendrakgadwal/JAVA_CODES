/**
 * Created by GADWAL on 3/31/2017.
 */
public class Print_ACSII_value_of_all_char {

    public static void main(String args[]){

//        char ch;
//        for(ch='A' ; ch<='Z' ; ch++ ){
//            System.out.println("The ASCII value of " + ch + " is " +(int)ch);
//        }

        for(int i =0; i < 255; i++){
            System.out.println(i+"=>"+(char)i);
        }

    }

}
