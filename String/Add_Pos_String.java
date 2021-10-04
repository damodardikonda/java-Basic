import java.io.*;

class Add_Pos_Str{

	public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
       int pos = Integer.parseInt(br.readLine());

       String str = "Damodar Dikonda";

       String s = " Bhaskar";
       
       StringBuffer newstr = new StringBuffer(str);
       newstr.insert(pos+1,s);

       System.out.println(newstr.toString());
	}
}