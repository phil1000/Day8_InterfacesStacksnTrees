public class StringStackScript {

	public void launch() {
		//Create and arraystring stack
		ArrayStringStack myArrayStrStack = new ArrayStringStack();
		this.testStack(myArrayStrStack);
		
		PointerStringStack myPointerStack = new PointerStringStack();
		this.testStack(myPointerStack);
	}
	
	public void testStack(StringStack stack) {
		// Because we use the stack interface as the input rather 
		// than array or pointer stack classes, this method works for both types of stack
		
		for (int i=0; i<10; i++) {
			stack.push("String" + i); // add 10 strings to the stack
		}
		
		System.out.println(stack.peek()); // take a look but don't delete last item on the stack
		
		while (stack.isEmpty()!=true) {
			System.out.println(stack.pop()); // delete items from stack one by one 
		}
		
		if (stack.isEmpty()) {
			System.out.println("stack is now empty");
		}
		
	}
	
	public static void main(String[] args) {
		StringStackScript myStringStackScript = new StringStackScript();
		myStringStackScript.launch();
	}

}