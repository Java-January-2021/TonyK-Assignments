public class Samurai extends Human2{
	private int health = 200;
	private static int counter;
	
	public Samurai() {
		this.health = 200;
		counter++;
		
	}

	public void deathBlow(Human2 h) {
		System.out.println("Blowing");
		h.health = 0;
		health = health /2;
	}

	public void meditate() {
		health = health + health/2;
	}

	public void howMany() {
		System.out.println("There are " + counter + "Samurai");
	}
}
