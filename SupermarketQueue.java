public class SupermarketQueue implements PersonQueue {
	private Person head;
	
	public SupermarketQueue() {
		head=null;
	}
	public void insertPerson(Person person) {
		Person newPerson = new Person(person);
		if (head!=null) {
		
			
		} else {
			head=newPerson;
		}
	}
	
	public Person retrieve() {
	}
	
	public int getSize() {
	}

}