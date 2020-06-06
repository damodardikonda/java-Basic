import java.lang.*;

class PrivateVars{

  private int pVar=10;

     public void acessPrivate(){
       System.out.println("printing privatevalue");
        return pVar;

       }
}



class AccesssPrivate{
  
  public static void main(String []args){

       PrivateVars obj=new PrivateVars();
      
     int pVar = obj.acessPrivate();
       System.out.println(pVar);

}
}