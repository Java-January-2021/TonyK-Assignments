public class Human2 {

        protected int strength = 3;
        protected int stealth= 3;
        protected int intelligence = 3;
        protected int health = 100;
   
        public void attack(Human2 h) {
            this.health = h.health - strength - stealth - + intelligence;
        }
        public void showHealth() {
            System.out.println("Health" + health);
        }
    }