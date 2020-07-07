class infinity_War{
 
     int gamma=1;   
     static int gauntlet=2;
     int hammer=1;
     static int vibranium=2;

     void mjolnir(){

      System.out.println("only thor is worthy");
     }

      static void gauntlet(){

         System.out.println("thanos ");
         System.out.println("Iron man ");
}
 
      void hulk(){
             System.out.println("bannaer ");
         }


      static void wakanda_Vibranium(){
	System.out.println("Captain america shield ");
	System.out.println("Black panther suit");
        }
}


class Avengers{

      public static void main(String []args){

          infinity_War assemble = new infinity_War();
          assemble.mjolnir();
          assemble.hulk();
          assemble.gauntlet();
          infinity_War.wakanda_Vibranium();
}


}