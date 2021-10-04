class Flat{

    int mob=10;
    static int tv=20;

    static {
            System.out.println(" \n\nIt will run first");
            System.out.println(tv);
    }

  Flat(){

   System.out.println("after static block it will print");
}
     
       public static void main(String args[]){

       Flat f= new Flat();
      System.out.println("Static and Instance variable");

     }


}