class StackOp{
	
	int stack[];
	int capacity;
	int top;

	StackOp(int val){

		stack = new int[val];
		capacity = val ;
		top = -1;
	}

	public boolean isFull(){

		if(top == capacity-1)
			return true;
		else 
			return false;
	}

	public boolean isEmpty(){

		if(top == -1)
			return true;
		else return false;
	}

	public void push(int x){

		if(isFull()){

			System.out.println(" Overflow");
			System.exit(1);
		}else{

			stack[++top] = x; 
			System.out.println(x + "is Pushed");
		}
	}

	public void pop(){

		if(isEmpty()){

			System.out.println("Underflow");
			System.exit(1);
		}else{

			System.out.println("Removing Elements " + peek());
			int x = stack[top--];
		}

	}

	public int peek(){

		if(!isEmpty())
		return stack[top];

		else{

			System.out.println("Underflow");
			System.exit(1);
			return 0;
		}

	}

	public static void main(String[] args) {
		
		StackOp st = new StackOp(5);
		st.push(10);
		st.push(20);
		st.push(30);st.push(40);st.push(50);


		st.pop();
     	st.pop();
	}
}