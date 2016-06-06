
public class Person implements Info {
	private String name = "Rashmi";
	
	public Person(String name) {
		this.name = name;
	}

	public void greet() {
		System.out.println("Hello there.");
	}

	@Override
	public void showInfo() {
		System.out.println("Persona name: " + name);
		
	}

}
