class examCancel{

   int x=10;
   static int y=20;
   int z=230;


    void happy(){
     System.out.println("We are happy now");
     }

     static void decisionPending(){

        System.out.println("Angry");
    }

}


class Student{

   public static void main(String []args){

      examCancel o=new examCancel();
      o.happy();
      examCancel.decisionPending();
}
}