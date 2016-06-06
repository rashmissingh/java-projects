class Frog {
	private int id;
	private String name;
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// In the absence of toString() sysout will print '<classname>@<hashcode>'
	// e.g Frog@15db9742
	public String toString() {
		//return "Inside empty toString() method";
		//return id + ": " + this.name;  <-- inefficient
		/* efficient, but too much work to return concatenated strings
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
		*/
		return String.format("%4d: %s", id, name);
	}
	
}
public class App {
	public static void main(String[] args) {
		Frog f1 = new Frog(4, "Bulldog");
		Frog f2 = new Frog(5, "Prince");
		
		System.out.println(f1);
		System.out.println(f2);
	}

}
