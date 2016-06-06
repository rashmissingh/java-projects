package world;

public class Field {
	private Plant plant = new Plant();
	
	public Field() {
		// size is protected; Field is in same package
		System.out.println(plant.size);
		
	}
}
