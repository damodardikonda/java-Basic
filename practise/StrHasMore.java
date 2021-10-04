import java.io.*;
import java.util.*;

class StrTok{

	public static void main(String[] args) {
		
		String s1 = "Damodar,A,King,67,90.76";
		String s2 = "Dikonda,B,Baadsha,90,678.98";


		StringTokenizer st1 = new StringTokenizer(s1,",");
		StringTokenizer st2 = new StringTokenizer(s2,",");

		for (int i = 0 ;  st1.hasMoreElements() ; i++ ) {
			
			System.out.println(st1.nextToken());
		}

		while(st2.hasMoreElements()){

			System.out.println(st2.nextToken());
		}
	}
}