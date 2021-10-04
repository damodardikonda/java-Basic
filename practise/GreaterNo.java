import java.io.*;
class GreaterNo{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Enter 3 Numbers");
		int a= Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());

        if((a>c) && (a>b)){

        	System.out.println("A is greater ");
        } else if((b>a) && (b>c))
        	System.out.println("B is Greater");
        else 
        	System.out.println(" C is greater");
	}
}