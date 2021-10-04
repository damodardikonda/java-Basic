import java.io.*;

class ParamConstruct{

	String name , clg;
	int roll ;
    ParamConstruct( String name , int roll ,  String clg){

    	this.name = name;
    	this.roll = roll;
    	this.clg = clg ;
    }

    void Display(){

    	System.out.println("My Name is = " + name ) ;
    	System.out.println(" My roll no is = " + roll);
    	System.out.println(" Clg name is = " + clg);
    }
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in));

		System.out.println("Enter name : ");
		String name = br.readLine();

		System.out.println("Enter college name : ");
		String clg = br.readLine();
		
		System.out.println("Enter roll no : ");
		int roll = Integer.parseInt(br.readLine());
		
		ParamConstruct pc = new ParamConstruct(name , roll , clg);
		pc.Display();
	}
}