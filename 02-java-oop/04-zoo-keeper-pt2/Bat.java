public class Bat {
    int energyLevel;

    public Bat() {
        energyLevel = 300;
    }

    public int energy() {
        System.out.println(energyLevel);
        return energyLevel;
    }

    public int fly() {
        System.out.println("Bat can fly now");
        energyLevel -= 50;
        return energyLevel;
    }

    public int eatHumans() {
        System.out.println("Bat bites human");
        energyLevel += 25;
        return energyLevel;
    }

    public int attackTown() {
        System.out.println("Bat attacks the city");
        energyLevel -= 100;
        return energyLevel;
    }
    
}