class Widening{
public static void main(String []rg)
{
//if else
if(20>40)
{
System.out.println(20);
}
int i=10;
float f=i;
System.out.println(i);
System.out.println("widening typecasting:"+f);

//Narrowing
float h=10.45f;
int a=(int)h;
System.out.println(h);
System.out.println("narrowing typecasting:"+a);


}}