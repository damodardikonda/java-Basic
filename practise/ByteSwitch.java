import java.io.*;

class ByteSwitch{

	public static void main(String[] args) throws IOException{
		
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
 
        byte b = Byte.parseByte(br.readLine());

        switch(b){

        	case 100 :
        			System.out.println("100");
        	        break;
        	case 104 :
        			System.out.println("200");
                    break;
            case 107:
            	   System.out.println("300");
            	   break;

            default:
            		System.out.println("Default");
        }

	}
}