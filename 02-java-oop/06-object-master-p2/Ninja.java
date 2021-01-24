public class Ninja extends Human2{
	private int stealth = 10;
	
	public void steal(Human2 h) {
		System.out.println("Stealing");
		h.health = h.health - stealth;
		health = health + stealth;
    }
    
	public void runAway() {
		System.out.println("Running");
		health = health - 10;
	}
}