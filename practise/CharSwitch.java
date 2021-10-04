import java.io.*;

class CharSwitch{

	public static void main(String[] args) throws IOException {
		
        BufferedReader br = new BufferedReader( new InputStreamReader (System.in));

        char a = (char) br.read();

        switch(a){
           case 'A':
                System.out.println("10");
                break;


           case 66:
                System.out.println("20");
                break; 

           case 'c':
                System.out.println("30");
                break;


           case 122:
                System.out.println("50");
                break;
	}
}

}