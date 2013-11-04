public class KidPerson implements Person {
	String name;
	int age;
	int currentLocation=2;
	
	public KidPerson(String name, int age) {
		this.name=name;
		this.age=age;
	}

	public void move(int distance) {
		currentLocation=currentLocation+distance;
		System.out.println(this.name + " is " + this.currentLocation + " from home");
	}
	
	public void say(String message) {
		System.out.println( this.name + " is a child and says " + message);
	}
}