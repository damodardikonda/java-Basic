import java.io.*;


class Input6{
	
	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);

        int str1 = Integer.parseInt(br.readLine());
		System.out.println(str1);

		int str2 = Integer.parseInt(br.readLine());
		System.out.println(str2);

      int ans = str1 + str2;
     System.out.println(ans); // 60+40=100
		}
}