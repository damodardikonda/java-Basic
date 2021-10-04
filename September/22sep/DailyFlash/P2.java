import java.io.*;

class P2{

    public static void main(String[] args) throws IOException{
    	
    	BufferedReader br = new BufferedReader( new InputStreamReader ( System.in));

        int i = 1;
        int sum = 1;
        while(i <= 100){
    	int n = Integer.parseInt(br.readLine());

    	if( n < 50){

    		sum = sum + n;
    	}
    	else{
            sum = sum+n-1;

    		break;
    	}

    	i++;

    }

    System.out.println("sum = " + sum);
}
}