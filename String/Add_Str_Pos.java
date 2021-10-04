import java.io.*;

class Add_Str{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

		int pos = Integer.parseInt(br.readLine());

		String str = " Damodar Dikonda";
		String str1= " Bhaskar ";
        int i = 0,k = 0,j=0;
		char ch[] = str.toCharArray();
        char ch1[] = str1.toCharArray();
	    char ch2[] = new char[50];

	     while(ch[i] < ch.length){

	     	if(i == pos ){

	     		while( ch1[j] < ch1.length){
                       
                       ch2[k] = ch1[j];
                       j++;
                       k++;

	     		}
	     	}

	     	else{

	     		ch2[k] = ch[i];
	     		
	     		k++;
	     	}
	     	i++;
	     }	

	     String str2 = ch2.toString();
	     System.out.println(str2);
		}

	}