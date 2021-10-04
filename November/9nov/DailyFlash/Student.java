import java.io.*;
class Student{

    String name ;
	Student(String name ){

       this.name = name;
	}

   Student(int roll){
   	System.out.println("Unknown");
   }
	void display(){

		System.out.println("name is " + name);
	}


	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in));

		System.out.println("Enter the Boolean  ");
        
       Boolean ok = Boolean.parseBoolean(br.readLine()) ;
        if(ok == true){
        Student s1 = new Student(20);
        }
        else{
        	Student s2 = new Student("Damodar");
        }
	}
}