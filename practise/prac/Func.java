import java.io.*;

class FuncTest{

	int evod(int n){

		if(n%2==0)
			return 1;
		else 
			return 0;
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader ( System.in));

		int num = Integer.parseInt(br.readLine());
		FuncTest o = new FuncTest();
		int flag = o.evod(num);

		if(flag == 1)
			System.out.println("Even ");
		else
			System.out.println("Odd");
	}
}