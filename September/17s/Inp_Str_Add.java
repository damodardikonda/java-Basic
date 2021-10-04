import java.io.*;


class Input5{
	
	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);

        String str1 = br.readLine();
		System.out.println(str1);

		String str2 = br.readLine();
		System.out.println(str2);

     System.out.println(str1 + str2); // 60+40=6040
		}
}