import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int test_case = 0;test_case<t;test_case++){
		    int s = sc.nextInt();
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    if(n<m){
		        System.out.println("-1");
		    }else{
		        int units_left=0;
		        int days_purchased;
				int day = 1;
		        for(day = 1;day<s+1;day++){
		            if(day%7!=0){
		                units_left = units_left + n;
		            }
		            units_left = units_left - m;
		            if(units_left<0){
		                System.out.println("-1");
		                day = 1000;
		            }
		        }
				if(day>100){
				}else{
					
			        int units_needed=m*s;
			        if(units_needed%n==0){
			            System.out.println(String.valueOf(units_needed/n));
			        }else{
			            System.out.println(String.valueOf((units_needed/n)+1));
			        }
				}
		    }
		}
	}
}