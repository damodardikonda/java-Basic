import java.util.*;
class P4{

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);

    	System.out.println("Enter the String");
    	String sb = new String(sc.nextLine());

       String sb1 = new String();

      System.out.println(sb);
       sb1 = sb.replaceAll(" " ,"");

       System.out.println(sb1);
    }

}