import java.io.*;
class P2{
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader ( System.in));

          System.out.println("Enter the String");
          StringBuilder sb = new StringBuilder (br.readLine());
          System.out.println(sb.capacity()); // 16 +7 = 24

          sb.append("Technologies");//11
	      System.out.println(sb.capacity()); //7 +11 = 18 < 24 = 24


          sb.append("Biencaps");//8
	      System.out.println(sb.capacity()); // 18+8 = 26 > 24 = 50
	}
}