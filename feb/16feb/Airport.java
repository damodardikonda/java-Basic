import java.io.*;
class AirportException extends Exception{


	String msg = "";

	AirportException(String s1){

		msg = s1;
	}

	public String toString(){

		return msg;
	}

	public String getMessage(){

		return msg;
	}
}

class WeightException{

	void CheckWeight() throws IOException{

        BufferedReader br = new BufferedReader( new InputStreamReader (System.in));

       try{

        		int weight = Integer.parseInt(br.readLine());
        		if(weight > 50){

        			throw new AirportException(" Weight jara jastach ahe kami kara");
        		}
			} catch (NumberFormatException e){

				System.out.println(" Please Enter Integer value");
			}catch(AirportException x){

				System.out.println(x.toString());
				System.out.println(x.getMessage());
			}

		}

		public static void main(String[] args) throws IOException{
			
			WeightException we = new WeightException();
            we.CheckWeight();
		}
	}
