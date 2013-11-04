public interface StringStack {
	void push(String newString);
	String pop();
	String peek();
	boolean isEmpty();
}