class Stack{

	int arr[];
	int capacity;
	int top;

	Stack(int size){

		arr = new int[size];
		capacity = size;
		top = -1;
	}

	public void push(int x){

		if(isFull()){

			System.out.println("Stack is Full / OverFlow");
			System.exit(1);

		}
		System.out.println("Entering " + x + " into the stack ");
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

			System.out.println("Removing top " + peek());
			
			System.out.println(arr[top--]);
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
		
		Stack stack = new Stack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		stack.pop();
		stack.pop();
		stack.pop();

		stack.push(80);
		stack.push(90);

		stack.pop();

		System.out.println(stack.top+1);
	}
}