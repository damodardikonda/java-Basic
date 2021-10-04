import java.io.*;

class Conn_Buff{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br1 = new BufferedReader( new InputStreamReader (System.in));

		System.out.println(br1.readLine());
        System.out.println(br1.readLine());

        //br1.close();

       BufferedReader br2 = new BufferedReader( new InputStreamReader (System.in));

        br1.close();
        
        System.out.println(br2.readLine());



	}
}