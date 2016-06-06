import world.Plant;

public class Grass extends Plant {
	public Grass() {
		// Won't work - even if it extends Plant class
		// Grass is not in same package as Plant
		// this.height = 10;
	}

}
