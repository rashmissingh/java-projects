package world;

public class Oak extends Plant {
	public Oak() {
		// Won't work, type is private
		// type = "tree";
		
		// Works - size is protected, Oak is a subclass of Plant
		this.size = "large";
		this.height = 20;
	}
}
