public class iPhone extends Phone implements Ringable {
    public iPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	String ringer = getRingTone();
		return ringer;
    }
    @Override
    public String unlock() {
		return "iPhone is unlocked";
    }
    @Override
    public void displayInfo() {
    	System.out.println("iPhone " + getVersionNumber() + " from " + getCarrier() + " has " + getBatteryPercentage() + "% battery.");          
    }
}