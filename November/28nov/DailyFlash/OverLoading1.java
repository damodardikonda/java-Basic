 class Overload1{

      void m1( int x){

      	   System.out.println(" Integer Method");
      }

      void m1( float d){

      	   System.out.println(" Float Method");
      }

      void m1( char ch ){

      	   System.out.println(" Character Method ");
      }

      void m1( String s ){

      	   System.out.println(" String Method ");
      }


      public static void main(String[] args) {
      	
      	 Overload1 o = new Overload1();
      	 o.m1(100);
      	 o.m1( 23.67f);
      	 o.m1('A');
      	 o.m1(" Damodar");
      }
 }