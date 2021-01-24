public class Mammal {
	
	protected int energyLevel = 100;

	public int displayEnergy() {
		System.out.println("Current Energy Level: " + this.getEnergyLevel());
		return this.getEnergyLevel();
	}

	public int getEnergyLevel() {
		return this.energyLevel;
	}
	public void setEnergyLevel(int energy) {
		this.energyLevel = energy;
		if(this.getEnergyLevel() > 100) {
			setEnergyLevel(100);
		}
	}
}