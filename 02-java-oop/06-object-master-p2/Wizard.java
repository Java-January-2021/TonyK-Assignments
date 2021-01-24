public class Wizard extends Human2{
	private int health = 50;
	private int intelligence = 8;
	
	public void heal(Human2 h) {
		System.out.println("Healing");
        h.health = h.health + intelligence;
        System.out.println(health);
	}

	public void fireball(Human2 h) {
		System.out.println("Fireballing");
		h.health = h.health - (intelligence *3);
    }
    
}