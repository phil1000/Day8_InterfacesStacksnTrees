public class PersonInterfaceHandler {
	//need program wide variables here
	
	public void launch() {
	
		AdultPerson phil = new AdultPerson("Phil", 47);
		AdultPerson isabelle = new AdultPerson("Isabelle", 43);
		KidPerson bruno = new KidPerson("Bruno",9);
		KidPerson flora = new KidPerson("Flora", 6);
		
		phil.move(10);
		isabelle.move(8);
		bruno.move(6);
		flora.move(4);
		
		phil.say("hurry up");
		isabelle.say("slow down");
		bruno.say("can I have a toy");
		flora.say("can I have some chewing gum");
	}
	
	//need a main class here
	public static void main(String[] args) {
		PersonInterfaceHandler newPI = new PersonInterfaceHandler();
		newPI.launch();
	}
}