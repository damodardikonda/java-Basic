/*Program to check wether bitwise operations works on all types of primitive data types*/
class CheckBitwise
{
	public static void main(String[] args) {
	    
	    int num1=5,num2=10;
	    float fnum1=5.1f,fnum2=10.5f;
	    char c1='a',c2='f';
	    long lnum1=10000,lnum2=24122;
	    double dnum1=12.450,dnum2=13.2133;
	    
	    //for Bitwise AND &
	    System.out.println(num1&num2);
	    System.out.println(fnum1&fnum2);
	    System.out.println(dnum1&dnum2);
	    System.out.println(c1|c2);
	    System.out.println(lnum1|lnum2);
	    
	    // for Bitwise OR |
	    System.out.println(num1|num2);
	    System.out.println(fnum1|fnum2);
	    System.out.println(dnum1|dnum2);
	    System.out.println(c1|c2);
	    System.out.println(lnum1|lnum2);
	    
	    //for Bitwise XOR ^
	    System.out.println(num1^num2);
	    System.out.println(fnum1^fnum2);
	    System.out.println(dnum1^dnum2);
	    System.out.println(c1^c2);
	    System.out.println(lnum1^lnum2);
	    
	}
}

/*COnclusion: 
error for data types float and double: bad operand types for binary operator 'opertor'*/
