
import java.io.*;
import java.util.*;

class StrHasMoreEle{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

		String s1 = br.readLine();

		StringTokenizer st1 = new StringTokenizer(s1 ,",");

		for (int i = 0 ; st1.hasMoreElements() ; i++) {
			
			System.out.println(st1.nextToken());
		}
	}
}