public class HumanTest {

	public static void main(String[] args) {
		Human wizard = new Human();
		Human ninja = new Human();
		Human samurai = new Human();
		System.out.println(wizard.getHealth());
		System.out.println(ninja.getHealth());
		System.out.println(wizard.getStrength());
		System.out.println(wizard.getStealth());
		System.out.println(wizard.getIntelligence());
        wizard.attackHuman(ninja);
        samurai.attackHuman(wizard);
        ninja.attackHuman(samurai);
		System.out.println(wizard.getHealth());
        System.out.println(ninja.getHealth());
        System.out.println(samurai.getHealth());
	}
}