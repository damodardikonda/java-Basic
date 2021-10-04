import java.io.*;
class Zomato{

     void goOut(){

     	System.out.println("Fuck off");

     	class XYZ{

            void m2(){
     		class PQR{


     		}

     	}
     	}
     } 



     void order()throws IOException {
     
               System.out.println("Khaaaooo Aur Khushiya manaoooooo...........");
               
               class Hotels{

               	    String hotelName = null;
                    
                    Hotels( String hname ){

                          hotelName = hname ;

                    }
                    
                    void placedOrder(){

                    	System.out.println("Hotel name is = " + hotelName);
                    }


               }

               BufferedReader br = new BufferedReader( new InputStreamReader( System.in));

               System.out.println("Enter hotel Name");
               String hname = br.readLine();
               Hotels h = new Hotels(hname);
               h.placedOrder();
     }
     public static void main(String[] args) throws IOException{
     	
     	Zomato z = new Zomato();
     	z.order();
     	z.goOut();
     }
}