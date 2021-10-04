import java.io.*;

class Work{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

		System.out.println("Enter Age");
		int age = Integer.parseInt(br.readLine());

		System.out.println("Enter Sex");
		char sex = (char) br.read();

		if(sex == 'm' || sex == 'M' || sex == 'F' || sex == 'f'){

			System.out.println("Allowed");
		}else{
            System.out.println("Enter Sex");
			 sex = (char) br.read();

		}
			br.skip(2);
		System.out.println("Enter Maratial status");

		char status = (char) br.read();

		if(status == 'Y' || status == 'y' || status == 'N' || status =='n'){

			System.out.println("Allowed");
		}else{

			System.out.println("Enter status");
			 status = (char) br.read();
		}

		if(sex == 'f' || sex =='F')
			System.out.println("Urban Area");
		else if((sex == 'm' || sex == 'M') && age > 20 && age < 40){

			System.out.println("Kuthe hi");
		}



	}
}