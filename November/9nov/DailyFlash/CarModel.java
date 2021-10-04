import java.io.*;
class CarModel{

     String modelName;

     CarModel(String name ){

     	modelName = name;
     }

     void getModelName(){

     	System.out.println("Model name is = " + modelName);
     }

     public static void main(String[] args) throws IOException{
     	
     	BufferedReader br = new BufferedReader( new InputStreamReader( System.in)) ;

     	System.out.println("Enter the name ");
     	String name = br.readLine();

     	CarModel c = new CarModel(name);
     	c.getModelName();
     }
}