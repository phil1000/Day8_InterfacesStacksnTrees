public class Supermarket {
	
	public void launch() {
		SupermarketQueue mySuperQueue = new SupermarketQueue();
		this.testQueue(mySuperQueue);
	}
	
	public void testQueue(PersonQueue inQueue) {
		for (int i=0; i<10; i++) {
			Person newPerson = new Person("Customer" + i);
			System.out.println("Customer " + newPerson.getName() + " added");
			inQueue.insertPerson(newPerson);
		}
		
		System.out.println("Number of customers is " + inQueue.getSize());
		
		Person currentHead = inQueue.retrieve();
		while (currentHead != null) {
			System.out.println("Customer Name " + currentHead.getName() + " retrieved");
			currentHead=inQueue.retrieve();
		}
		
		System.out.println("Number of customers is " + inQueue.getSize());
	}
	
	public static void main(String[] args) {
		Supermarket mySP = new Supermarket();
		mySP.launch();
	}
}