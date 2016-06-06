class Person {
	int age;
	String name;
	
	void speak() {
		System.out.println("My age is: " + age);
	}
	
	int calculateYearsToRetirement() {
		int yrs = 65 - age;
		System.out.println("Years to retirement: " + yrs);
		return yrs;
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name; 
	}
	
}
public class App {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.age = 25;
		person.name = "Joe";
		person.speak();
		
		int years = person.calculateYearsToRetirement();
		System.out.println("Time left: " + years);
		
		int age = person.getAge();
		String name = person.getName();
		
		System.out.println("My name is: " + name);
		System.out.println("My age is: " + age);
		
	}

}
