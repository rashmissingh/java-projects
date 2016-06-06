
public class Car extends Machine {
	public void start() {
		System.out.println("Car started.");
	}
	
	@Override
	public void stop() {
		System.out.println("Car stopped.");
	}

	public void wipeWindShield() {
		System.out.println("Wiping windshield.");
	}
	
	public void showInfo() {
		System.out.println("Car name: " + name);
	}

}
