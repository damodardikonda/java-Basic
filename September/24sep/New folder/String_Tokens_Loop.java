import java.io.*;
import java.util.*;

class Str_Token_Loop{
	
        public static void main(String[] args)  throws IOException{
        	
            BufferedReader br = new BufferedReader( new InputStreamReader ( System.in));

            String str[] = new String[4];
            int i = 1 , count = 0 , a=1 ,b=1 , c=1 ,d=1;
            for ( ; i < 4 ; i++ ) {
                
                System.out.printf("Enter %d student = " , i);	
            	str[i] = br.readLine();
            
             System.out.println("Enter Delimeter");
            String ch = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(str[i] , ch);
              
              System.out.println(" Delimiter is  " + ch);
              if(ch == " "){
                  a++; 
                  if( a== 2)
                    break;
                else
                 count++;
              } else if( ch == ","){
                 b++;
                if(b == 2)
                    break;
                else
                count++;
              } else if( ch == "."){
                 c++;
                if ( c == 2)
                    break;
                else
                 count++;
              }else if ( ch == "_"){
                d++;

                if(d==2){
                    break;
                }else
                count++;
              }

            String name = st.nextToken().trim();

            char grade = st.nextToken().charAt(0);

            int age = Integer.parseInt( st.nextToken().trim());

            double  marks = Double.parseDouble( st.nextToken().trim());

            System.out.println(" Name " + name);
            System.out.println(" grade = " + grade);
            System.out.println(" Age = " + age);
            System.out.println(" marks" + marks); 

        }

        System.out.println(" Delimiter count is " + count);
}

}