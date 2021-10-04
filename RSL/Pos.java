// east west south north 1 --- unit 
import java.util.*;
class Pos{

	public void fun( char arr[] , char c[]){
		char pos = arr[0]; // ps = R
		int count[] = new int[4]; 
		for(int k = 0  ; k < c.length ; k++){
			char x = c[k];
		

		for(int i = pos+1  ; i < arr.length ; i++){

		if( x == 'R')
			count[0]++;
		else if(x == 'L') 
				count[1]++;
		else if (x == 'U')  
			count[2]++;
		else if (x == 'D')
			count[3]++;
	}

	for(int j = 1  ; j < arr.length ; j++){

		
		if( x == 'R')
			count[1]--;
		else if(x == 'L') 
			count[0]--;
		else if (x == 'U')  
			count[3]--;
		else if (x == 'D')
			count[2]--;
	}

}
		if(count[0] == 0 && count[1] == 0 && count[2] == 0 && count[3] == 0)
			System.out.println("Return at begin");
		else 
			System.out.println(" Not Returning");
	} 

	public static void main(String[] args) {
		
		char arr[] = {'R' , 'L' ,'U' ,'D'};
		char c []  = new char[10];
		System.out.println(" Enter the Pos ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		//c = str.toCharArray();
		int k = 0 ;

		while(k < c.length && k < str.length()){

			c[k] = str.charAt(k);
			k++;
		}
		
		Pos p = new Pos();
		p.fun(arr ,  c);
	}
}