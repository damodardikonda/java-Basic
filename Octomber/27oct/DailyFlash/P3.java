 import java.util.Scanner;
 class P3{

      public static void main(String[] args) {
      	
      	Scanner sc = new Scanner(System.in);

      	StringBuffer sb = new StringBuffer(sc.next());

      	sb = sb.insert(4 ,"2Web");
        System.out.println("Inserted String is =  ");
        System.out.println(sb);


      	StringBuffer sb1 = new StringBuffer(); 
      	sb1 = sb.reverse();
      	System.out.println(sb1);

        StringBuffer sb3 = new StringBuffer();
        sb3 = sb.replace(5,9,"8888");
        System.out.println("Replaced String = " + sb3 );

        StringBuffer sb2 = new StringBuffer("Core2webTechnologiess");
        sb2.delete(7,10);
        //System.out.println(sb2);

        char c ;
        
        for (int i = 0 ; i < sb2.length() ; i++ ) {
           c = sb.charAt(i);
           System.out.print(c + " ");
        }

        sb2.append("Technologies");
        System.out.println(sb2);


      }
 }