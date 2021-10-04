class StringFormatter {  
public static void main(String[] s){  
   String	x = " My name is khan ";
    String words[]=x.split("\\s");  
    String reverseWord="";  
    for(String w:words){  
        StringBuilder sb=new StringBuilder(w);  
        sb = sb.reverse(); 
          System.out.print(sb + " ");
    }  
     
}  
}  