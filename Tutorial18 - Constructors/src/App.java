class Machine {
	private String name;
	private int code;
	
	public Machine() {
		this("Brat", 0);
		System.out.println("First Constructor!");
	}
	
	public Machine(String name) {
		this.name = name;
		System.out.println("Second Constructor!");
	}
	
	public Machine(String name, int code) {
		this.name = name;
		this.code = code;
		System.out.println("Third Constructor!");
	}
}
public class App {

	public static void main(String[] args) {
		Machine m1 = new Machine();
		// new Machine();
		
		Machine m2 = new Machine("Bertie");
		
		Machine m3 = new Machine("Arnie", 7);
	}

}
