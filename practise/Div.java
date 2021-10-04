import java.util.Scanner;
class Div {

    boolean	 isDiv(int n ) {

    	if(n%5==0)
    		return true;
    	else
    		return  false;
    }
	public static void main(String[] args) {
		
             Scanner sc = new Scanner(System.in);
             int x = sc.nextInt();
             Div d = new Div();
             boolean ans = d.isDiv(x);

             if (ans == true) {
             	
             	System.out.println("Divisible by 5");
             }else {

             	System.out.println(" Not");
             }
	}
}