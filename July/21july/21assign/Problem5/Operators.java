/*

Write a Java code containing all the operators taught (Arithmetic, Logical,
Bitwise). Code must contain 3 Classes and one Main Class, where each class should
contain at least 1 static and 1 non s a=tatic methods. No operations should be
performed in main class Except Object Creation and Calling the methods
*/





class Arith_Logic{

    static int num1=20;
    static int num2=2;
 
    static int add=0;
 
     static void ArithmaticOp(){
       add=num1+num2;

       System.out.println("Addition of two numbers is = " + add);

       add=num1-num2;
       System.out.println("Subtraction of two number is" + add );

       add=num1*num2;
       System.out.println("Multiplication of two number is" + add);


       add=num1/num2;
       System.out.println("Division of two number is" + add );

      add=num1%num2;
      System.out.println("Moduus of two number is" + add);
 
  
   }

    
    int a=10;
    int b=20;
    boolean ans;
   
    void Rel(){
      ans = a== b;
      System.out.println("a== b =" +ans);
     
      ans = a!= b;
      System.out.println("a!=b " + ans);
    
      ans = a > b;
      System.out.println("a > b " + ans );
     
      ans = a < b;
      System.out.println(" a< b  " +ans);
     
       ans = a>= b;
      System.out.println("a>=b " +ans);

      ans= a<= b;
      System.out.println(" a<=b " +ans);
     
     }
 
}


class Log_Bit{

    static int x=10;
    static int y=20;
    static int ans;
    
    static void Bitwise(){

      ans= x & y;
      System.out.println(" x & y " +ans);
      ans= x | y;
      System.out.println(" a | b " +ans);
      ans= x ^ y;
      System.out.println(" x ^ y " +ans);
                  

    }
  
   int n1=11;
   int n2=12;
   boolean res;
  
   void Logic(){

    res= (++n1 == n2++ ) && (n1 <= n2);
    System.out.println("Logical And " + res);

    res= (n1 != n2++ ) || (n1 >= n2);
    System.out.println("Logical And " + res);

    

   }

 
}



class Operators{
          

   static public void main(String args[]){
 
     Arith_Logic al = new Arith_Logic();
     al.ArithmaticOp();
     al.Rel();


    Log_Bit lb = new Log_Bit();
    lb.Logic();
    lb.Bitwise();
        
    }
} 