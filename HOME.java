class HOME {
  int mob=1;
int lap=1;
static int tv=1;


void dmeth(){
System.out.println("mobile="+mob);
System.out.println("laptop="+lap);
System.out.println("Tv="+tv);

}

void kmeth(){
System.out.println("mobile="+mob);
System.out.println("laptop="+lap);
System.out.println("Tv="+tv);

}

public static void main(String []args){

HOME d=new HOME();
d.mob=0;
d.tv=0;
d.dmeth();


HOME k=new HOME();
k.kmeth();
}
}