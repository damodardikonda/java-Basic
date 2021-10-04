import java.io.*;
class P2{

  public static void main(String[] args) throws IOException{
  	
  	BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

  	String s1 = br.readLine();
  	String s2 = br.readLine();

  	if(s1.startsWith(s2)){

  		System.out.println("Yes");
  	}
  	else{

  		System.out.println("No");
  	}
  }
}