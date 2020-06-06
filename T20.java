//this is for only 1 class not for multiple class


class T20{
  static String capt="Virat k";
  int toss=0;

  static void list(){
   System.out.println("list of players");
    System.out.println(capt);
T20 o =new T20();     
System.out.println(o.toss);
   //System.out.println("virat jersy no=" + first.vk);
  }

 void  tossResult()
{ 
  System.out.println("bat or bowl");
  //System.out.println("virat jersy no=" + first.vk); static variable is not accessible by normal function
 //int vk=18;
  System.out.println(capt);
 System.out.println(toss);
}

public static void main(String []args){
  T20 first =new T20();
  first.tossResult();
  list();

}
}