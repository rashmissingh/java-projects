class Frog {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
public class App {
	public static void main(String[] args) {
		Frog frog = new Frog();
		
		// frog.name = "Bertie";
		// frog.age = 7;
		frog.setName("Bertie");
		frog.setAge(2);
		
		System.out.println("The name of the frog is " + frog.getName() + ", age is " + frog.getAge());
		
		Frog frog1 = new Frog();
		frog1.setAge(2);
		frog1.setName("Bulldog");
		System.out.println("My name is " + frog1.getName() + ", age is " + frog1.getAge());
		
	}

}
