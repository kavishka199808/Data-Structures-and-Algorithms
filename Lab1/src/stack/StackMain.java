package stack;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object
		Stack thestack = new Stack(10);
		
		thestack.push('S');
		thestack.push('T');
		thestack.push('A');
		thestack.push('C');
		thestack.push('K');
	
		
		//print peek element
		System.out.println("The peek Value of Stack : "+thestack.peek());
		
		while(!thestack.isEmpty()) {
			char ch2 = thestack.pop();
			System.out.println("top:" + ch2);
			
		}
		CheckBrackets.validateParenthesis("3 + ( (6 * 2) - 3)");
		CheckBrackets.validateParenthesis("5 * 6 + (2 - 5");
		CheckBrackets.validateParenthesis("5 * 6 +  (2 - 5))");
		
	}

}
