
class Program4
{
	public static void main(String[] args) {
	    int num=6;
	    long lnum=7;
	    float fnum=21.5f;
	    double dnum=211.312;
	    char c='f';
		System.out.println(~num);
		System.out.println(~lnum);
		System.out.println(~fnum);//error
		System.out.println(~dnum);//error
		System.out.println(~c);
	}
}

/*conclusion:
    Similar to other bitwise operators , ~ also do not work on float and double
    and gives error: bad operand type float/double for unary operator '~'*/