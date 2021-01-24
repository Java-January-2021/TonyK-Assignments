public class BatTest {
    public static void main (String[] args) {
        Bat darksoulBat = new Bat();

        darksoulBat.energy();
        // Default energy level display

        darksoulBat.attackTown();
        darksoulBat.attackTown();
        darksoulBat.attackTown();
        darksoulBat.energy();
        // Town attacked 3 times and current energy level

        darksoulBat.eatHumans();
        darksoulBat.eatHumans();
        darksoulBat.energy();
        // Recovering energy and current level

        darksoulBat.fly();
        darksoulBat.fly();
        darksoulBat.energy();
        // Wasting energy and current level
        // Question is how I can run a command twice or 3 times without repeatedly calling it?
    }
}