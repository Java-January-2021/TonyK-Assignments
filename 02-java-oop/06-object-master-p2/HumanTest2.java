public class HumanTest2 {

	public static void main(String[] args) {
		Human2 h = new Human2();
		Human2 h2 = new Human2(); 
		h.attack(h2);
		h2.showHealth();
		Wizard wiz = new Wizard();
		Samurai sam = new Samurai();
		Ninja nin = new Ninja();
		nin.steal(wiz);
		wiz.fireball(nin);
		nin.showHealth();
		sam.deathBlow(nin);
		wiz.heal(sam);
        sam.showHealth();
        nin.runAway();
        wiz.heal(nin);
        wiz.showHealth();
        nin.showHealth();
		sam.showHealth();
	}

}