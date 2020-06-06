class encap{

  private int roll;
  private String name;

   public void setRoll(int r){
      this.roll=r;
   }
 public int getRoll(){
  return roll;
}

 public void setName(String n){
      this.name=n;
   }
 public String getName(){
  return name;
}

public static void main(String args[]){
encap e=new encap();
e.setRoll(10);
e.setName("damodar");

System.out.println(e.getRoll());
System.out.println(e.getName());
}

}