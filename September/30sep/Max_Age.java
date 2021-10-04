import java.io.*;

class Max_Age{
	
	public static void main(String[] args) throws IOException{
		
        BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));

       System.out.println("Enter number of students");
       int x = Integer.parseInt(br.readLine());

        int arr[] = new int[x];

        for (int i = 0 ; i < x ; i++ ) {
        	 

        	System.out.print(" Enter the age of student");
            
            arr[i] = Integer.parseInt(br.readLine());


        }


        int temp = arr[0];

        for (int i = 1 ; i < x ; i++ ) {
        	
        	if(arr[i] > temp ){
        		temp = arr[i];
        	}

        }

        System.out.println("Maximum Age is " + temp);
	}
}