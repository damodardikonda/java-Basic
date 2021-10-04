import- java.io.*;
class FinallyKeyword{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));

		try{

             System.out.println("In try block");
             System.out.println(br.readLine());
		}catch(Exception e){

			System.out.println("In catch");

		}
		finally{

			System.out.println(" Finally Block");
			br.close();
		}
	}
}