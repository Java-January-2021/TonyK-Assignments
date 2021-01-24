public class PhoneTest {

	public static void main(String[] args) {
		Galaxy note20 = new Galaxy("note20", 100, "ATT", "Phone is vibrating");
		iPhone iPhone12Pro = new iPhone("iPhone 12 Pro", 100, "Sprint", "Silence mode");
		
		note20.displayInfo();
		System.out.println(note20.ring());
		System.out.println(note20.unlock());
		
		iPhone12Pro.displayInfo();
		System.out.println(iPhone12Pro.ring());
		System.out.println(iPhone12Pro.unlock());
	}

}