package stack;

public class Stack {
	
	private int top ;
	private char[] stackArray;
	private int maxSize ;
	
	public Stack(int s) {
		
		this.top = -1 ;
		this.stackArray = new char [s];
		this.maxSize = s;
	}
	
	//To check Stack is empty or not
	public boolean isEmpty() {
		return (top == -1);
	}
	
	//To check is full or Not
	public  boolean isFull() {
		return(top==(maxSize-1));
	}
	
	//insert element to stack
	public void push(char ch) {
		if(!isFull()) {
			//top = top+1;
			stackArray[++top]=ch;
		}
		else {
			System.out.println("Stack is Full");
		}
	}
	
	//Retrive element from stack
	public char pop() {
         if(!isEmpty()) {
        	 return stackArray[top--];
         }
         else {
        	 System.out.println("Stack is Empty");
         }
         return 0 ;
	}

}
