
import java.util.Scanner;
class Vowels{
	
	public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    System.out.println("ENter the Character");

    char a = sc.next().charAt(0);
    char b = 'e';

    if(a == 'i' || a== 'a'|| a=='e' || a=='o' || a=='u')
    {
    	System.out.println(a + " is a Vowels");
    	System.out.println(b + " is Vowels");
    } else {

    	System.out.println(a + " is not a vowels");
    } 

	}
}