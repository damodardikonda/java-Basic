class StackReverse{

	int arr[];
	int capacity;
	int top;

	StackReverse(int size){

		arr = new int[size];
		capacity = size;
		top = -1;
	}

	public void push(int x){

		if(isFull()){

			System.out.println("Stack is Full / OverFlow");
			System.exit(1);

		}
		System.out.println("Entering " +(char) x + " into the stack ");
		arr[++top] = x;
	}

	public Boolean isFull(){

		if(top == capacity-1 )
			return true;
	    else
		    return false;

	}

	public void pop(){

		if(isEmpty()){

			System.out.println("UnderFlow");
			System.exit(1);
		}else{

			System.out.print((char) peek());
			
			int  sb = arr[top--];
		}

	}

	public int peek(){

		if(!isEmpty())
			{return arr[top];}
		else{

			System.out.println("UnderFlow");
			System.exit(1);
			return 0;
		}
	}

	public Boolean isEmpty(){

		if(top == -1)
			return true;
		else return false;
	}
	public static void main(String[] args) {
		
		String s = "DamodarDikonda";
		int len = s.length();
		StackReverse stack = new StackReverse(len);
		
		for(int i = 0 ; i < len ;i++){

			char c = s.charAt(i);
			stack.push(c);
		}

		for(int i = 0 ; i < len ;i++){

			stack.pop();
		}

	}
}