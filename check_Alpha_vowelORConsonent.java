import java.util.Scanner;
public class check_Alpha_vowelORConsonent {
    public static void main(String args[]){
        char ch;
        Scanner sc=new Scanner(System.in);
<<<<<<< HEAD
        ch=sc.next().charAt(0);
=======
	ch=sc.next().charAt(0);
>>>>>>> 82ce748c6ed8999d1f389fe1264e59b8d8c17ab8
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonent");
        }
    }
}
