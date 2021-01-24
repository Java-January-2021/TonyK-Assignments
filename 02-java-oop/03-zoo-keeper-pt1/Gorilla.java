public class Gorilla extends Mammal {

	public void throwSomething() {
		System.out.println("Gorilla was running. Lost 5 energy.");
		this.setEnergyLevel(this.getEnergyLevel() - 5);
	}
	public void eatBananas() {
		System.out.println("Gorilla ate banana. Regained 10 energy");
		this.setEnergyLevel(this.getEnergyLevel() + 10);
	}
	public void climb() {
		System.out.println("Gorilla has climbed a tree. Lost 10 Energy.");
		this.setEnergyLevel(this.getEnergyLevel() - 10);
	}
} 