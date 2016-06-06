package world;

public class Plant {
	// Bad practice
	public String name;
	
	//Accepted practice  -- its final, cannot modify
	public final static int ID = 4;
	
	private String type;
	protected String size;
	int height;
	
	public Plant() {
		this.name = "Plant family";
		this.type = "plant";
		this.size = "medium";
		this.height = 8;
	}
	
}
