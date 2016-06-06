class Thing {
	public final static int LUCKY_NUMBER = 7;
	
	public static int count;	// Class variables, associated with class
	public int id;	// Instance variables, a copy is created for each instance
	
	public Thing() {
		id = count;
		count++;
	}
	
	public String name;
	public static String description;
	
	// instance method
	public void showName() {
		System.out.println(description + ": " + this.name);
	}

	// class method	
	public static void showInfo() {
		System.out.println("Static method");
		System.out.println("accessing static data: " + description);
		// Wont work, you cannot access instance variables in class methods
		// instance variables do not exist when class is created
		// System.out.println("accessing instance variable: " + name);
	}
}

public class App {

	public static void main(String[] args) {
		Thing.description = "I am a thing";	// This is how you call class method
		
		System.out.println("count before calling c'tor: " + Thing.count);
		Thing t1 = new Thing();
		Thing t2 = new Thing();
		
		t1.name = "thing-one";
		t2.name = "thing-two";
		System.out.println("Obj id: " + t1.id + ", " + t1.name);
		System.out.println("Obj id: " + t2.id + ", " + t2.name);
		System.out.println("count after calling c'tor: " + Thing.count);
		
		t1.showName();
		
		Thing.showInfo();
				
		System.out.println(Thing.description);
		
		System.out.println(Math.PI);
		
		// Math.PI = 3;
		// Warning System.out.println(t1.LUCKY_NUMBER);
		System.out.println(Thing.LUCKY_NUMBER);
		// Wrong t1.LUCKY_NUMBER = 6;
		
		// Can you set static variable outside the class?  Yes
		Thing.count = 11;
		System.out.println("setting count externally: " + Thing.count);
	}

}
