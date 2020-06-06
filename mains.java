class Kutumb{
 int mob=1;
 int lap=1;
 static int tv=1;

 void display(){
   System.out.println("no hello world");
   //int x=10;
 }

 static void statdisplay(){
   System.out.println("hii germi" );
 }


}

class mains{
  static public void main(String []args)
    {
        Kutumb o=new Kutumb();
        //o.x; it is not accessible because it is local variable of function.
        o.display();
        o.statdisplay();

   // Kutumb ob=new Kutumb();
     //   ob.display();
       // ob.statdisplay();
         // statdisplay();not unnable it is  not in same class so class ame is  requiredfor run
        Kutumb.statdisplay();    

} 
}