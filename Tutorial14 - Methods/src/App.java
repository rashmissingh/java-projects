class Person {
	String name;
	int age;
	
	void speak() {
		System.out.println("Hello, my name is " + name + " and I am " + age + " years old");
	}
	
}
public class App {

	public static void main(String[] args) {
		Person me = new Person();
		
		me.name = "Rashmi";
		me.age = 41;
		System.out.println(me.name);
		me.speak();
		
		Person friend = new Person();
		friend.name = "Reena";
		friend.age = 40;
		friend.speak();

	}

}
