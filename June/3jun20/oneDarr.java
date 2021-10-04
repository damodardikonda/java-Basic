import java.util.*;
class oneD{
	public static void main(String[] args) {
		
	
int len;
	Scanner sc=new Scanner(System.in);
	
	int a[]=new int[4];//declaration    	 

        for(int i=0; i<4; i++)
        {
           a[i] = sc.nextInt();
        }   
        System.out.print("Elements in Array are :\n");
        for(int i=0; i<4; i++)
        {
           System.out.print(a[i] + "  ");
        }  
	}
}