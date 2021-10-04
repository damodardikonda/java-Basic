
import java.io.*;

class Scholarship{

	public static void main(String[] args) {
		
		int year = 0;
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		try{

			year = Integer.parseInt(br.readLine());

		}catch( IOException e){

			e.printStackTrace();
			System.out.println(e.toString());
		}

		switch(year){

			case 1 :
					System.out.println("Not Eligiblke");
					break;
		
            case 2 :
            		System.out.println("Not Eligible");
            		break;

            case 3:

                  System.out.println("Enter marks");
                  int m =0;
                  try{
                   m = Integer.parseInt(br.readLine());
                  }catch(IOException ee){

                  }
                  switch(m/10){

                  		case 10:
                  		case 9 :
                  		case 8:
                  		case 7:
                  		case 6:
                  		      System.out.println("Scholarship");
                  		      break;

                  		case 5:
                  		case 4:
                  		case 3:
                  		case 2:

                  		     System.out.println("Lawda Gha");
                  }
		}


	}
}