import java.io.*;
class Army{

	class Cavalry{

		
	}

    class Infantry{

    	int numOfSoldier ;

    	Infantry(int numSoldier){

    		numOfSoldier = numSoldier;
    	}

    	void dispSoldier(){

    		System.out.println("the number of soldier are = " + numOfSoldier);
    	}
    }
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

		System.out.println("Enter the Number of soldier");
        int numSoldier = Integer.parseInt(br.readLine());
 
        
        Army a =new Army();
        Army.Infantry i = a.new Infantry( numSoldier);
        i.dispSoldier();


	}
}