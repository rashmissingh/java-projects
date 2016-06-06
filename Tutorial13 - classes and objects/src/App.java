class Person {
	// Instance variables  (data or state)
	String name;
	int age;
	
	// Classes can contain:
	// 1. Data
	// 2. Subroutines (methods)
}
public class App {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Rashmi";
		person1.age = 41;
		
		Person friend = new Person();
		friend.name = "Reena";
		friend.age = 40;
		
		System.out.println(person1.name);

	}

}
