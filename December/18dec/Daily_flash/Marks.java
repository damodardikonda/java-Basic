abstract class Marks{

	abstract void getPercentage();

}


class A extends Marks{
 
    int a , b, c = 0;
	A( int x , int y ,int z){

		a = x;
		b=y;
		c=z;
	}

    void getPercentage(){
        int total = a +b+c;
    	int percent = total/300*100;
    	System.out.println(percent);
    }
}


class B extends Marks{
 
    int a , b, c ,d= 0;
	B( int m1, int m2 ,int m3 , int m4){

		a = m1;
		
		b=m2;
		c=m3;
		d =m4;
	}

    void getPercentage(){
         int total = a+b+c+d;
         System.out.println(total);
    	int percent = total /400 *100;
    	System.out.println(percent);
    }
}


class Percentages{

      public static void main(String[] args) {
      	
      
	A  a = new A(80,90,98);
	a.getPercentage();

	B b = new B(98,97,96,87);
	b.getPercentage();
}
}