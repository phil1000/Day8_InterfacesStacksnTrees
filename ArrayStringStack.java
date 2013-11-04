public class ArrayStringStack implements StringStack {
	
	private String[] stringArray;
    private int size;
    private static int INITIAL_ARRAY_SIZE = 5;
	
	public ArrayStringStack() {
		stringArray = new String[INITIAL_ARRAY_SIZE];
		size=0;
	}
	public void push(String newString) {
		if (isAlmostFull()) {
			reserveMoreMemory();
		}
		stringArray[size]=newString;
		size++;
	}
	
	public String pop() {
		if (isEmpty()) {
			return null;
		}
		else {
			size--;
			String returnString=stringArray[size];
			stringArray[size]=null;
			return returnString;
		}
	}
	
	public String peek() {
		if (isEmpty()) {
			return null;
		}
		else {
			return stringArray[size-1];
		}
	}
	
	public boolean isEmpty() {
		if (size==0) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean isAlmostFull() {
		boolean isAlmostFull=false;
		if (stringArray.length - size < 1) {
			isAlmostFull=true;
		}
		return isAlmostFull;
	}
	
	private void reserveMoreMemory() {
		String[] newString = new String[size*2];
		for (int i=0;i<size; i++) {
			newString[i]=stringArray[i];
		}
		stringArray=newString;
	}
}